package ru.geekbrains.java2.dzad6.pimanov;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        ClientHere client = new ClientHere();
        System.out.println("Начало работы клиента. Подключение к порту 1111");

        new Thread() {
            public void run() {
                try {
                    client.readMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    client.sendMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

class ClientHere {
    String userMessage, serverMessage;

    public ClientHere() throws IOException {
        Socket socket = new Socket("localhost",1111);
        BufferedReader inReader  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outWriter = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    }

    void sendMessage() throws IOException {
        while (true) {
            if ((userMessage = console.readLine()) != null) {
                outWriter.println(userMessage);
                if (userMessage.equalsIgnoreCase("close") || userMSG.equalsIgnoreCase("exit")) break;
            }
        }
    }

    void readMessage() throws IOException {
        while (true) {
            if ((serverMessage = inReader.readLine()) != null){
                System.out.println(serverMessage);
            }
        }
    }

    void close() throws IOException {
        outWriter.close();
        inReader.close();
        console.close();
        socket.close();
    }
}
