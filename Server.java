package ru.geekbrains.java2.dzad6.pimanov;

/*
1. Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения, как на клиентской стороне, так и на серверной. 
Т.е. если на клиентской стороне написать "Привет", нажать Enter то сообщение должно передаться на сервер и там отпечататься в консоли. 
Если сделать то же самое на серверной стороне, сообщение соответственно передается клиенту и печатается у него в консоли. 
Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд, такую ситуацию необходимо корректно обработать
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Serv server = new Serv();
        server.start();
        server.catchClient();
        new Thread() {
            public void run() {
                while (true) {
                    String text = null;
                    try {
                        text = server.in.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (text != null) {
                        try {
                            server.sendMessage(text);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    server.writeToConsole();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

class Serv {
    BufferedReader inReader = null;
    PrintWriter outWriter = null;
    ServerSocket serverSocket = null;
    Socket socket = null;
    String input;
    BufferedReader console = null;

    void start() {
        try {
            serverSocket = new ServerSocket(1111);
        } catch (IOException e) {
            System.out.println("Порт 1111 не открывается");
            System.exit(1);
        }
        System.out.print("Сервер запущен, ждем соединения с клиентом");
    }

    void catchClient() throws IOException {
        try {
            socket = serverSocket.accept();
            System.out.println("Клиент подключен");
        } catch (IOException e) {
            System.out.println("Нет доступа");
            System.exit(1);
        }

        inReader  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        outWriter = new PrintWriter(socket.getOutputStream(),true);

        System.out.println("Ждем сообщение");
    }

    void sendMessage(String message) throws IOException {
        if (message.equalsIgnoreCase("exit")) close();
        out.println("S ::: " + message);
        System.out.println(message);
    }

    void close() throws IOException {
        outWriter.close();
        inReader.close();
        socket.close();
        serverSocket.close();
    }

    void writeToConsole() throws IOException {
        while (true) {
            console = new BufferedReader(new InputStreamReader(System.in));
            String text = console.readLine();
            sendMessage(text);
        }
    }
}
