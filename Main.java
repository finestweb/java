package ru.geekbrains.les_5_5;

import java.util.Arrays;

public class MAin {
    public static void main(String[] args) {
        Worker worker = new Worker("Олег", "программист", "info@finstweb.ru", "89253333333", 150000.56, 36);
        worker.infoAboutWorker();

        Workers[] workers = new Workers[5]; // Вначале объявляем массив объектов
        workers[0] = new Workers("Ivanov Ivan0", "Engineer0", "ivivan0@mailbox.com", "892315312", 300000, 45);
        workers[1] = new Workers("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892382312", 300100, 25);
        workers[2] = new Workers("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312312", 304000, 50);
        workers[3] = new Workers("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "894315812", 300020, 30);
        workers[4] = new Workers("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312512", 30000, 60);


        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                workers[i].print();
            }
        }

    }
}

/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;*/

class Worker{
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double pay;
    private int age;

    /* Конструктор класса должен заполнять эти поля при создании объекта;*/

    public Worker(String fio, String position, String email, String phone, double pay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    /* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;*/

    public void infoAboutWorker(){
        System.out.println("ФИО: " + fio + ", " + "Должность " + position + ", " + "Почта " + email + ", " + "Номер телефона " + phone + ", " + "Зарплата " + pay + ", " + "Возраст" + " " + age);
    }
}

/*Создать массив из 5 сотрудников*/

class Workers{

    private String fio;
    private String position;
    private String email;
    private String phone;
    private int pay;
    public int age;

    public Workers(String fio, String position, String email, String phone, int pay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
    
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                fio, position, email, phone, pay, age);
    }

    public void print(){
        System.out.println(this);
    }
}
