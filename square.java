package ru.geekbrains.les_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите сторону квадрата");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1; i <= a; i++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
        for(int i = 1; i <= a; i++)
        {
            if(i == 1 || i == a)
            {
                System.out.print("*");
            }else
            {
                System.out.print("&");
            }
        }
        System.out.println("\n");
        for(int i = 1; i <= a; i++)
        {
            if(i == 1 || i == a)
            {
                System.out.print("*");
            }else
            {
                System.out.print("&");
            }
        }
        System.out.println("\n");
        for(int i = 1; i <= a; i++)
        {
            if(i == 1 || i == a)
            {
                System.out.print("*");
            }else
            {
                System.out.print("&");
            }
        }
        System.out.println("\n");
        for(int i = 1; i <= a; i++)
        {
            System.out.print("*");
        }

    }
}
