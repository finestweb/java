package ru.geekbrains.les_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите сторону доски");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a * a;
        int c = a + 1;
        for(int i = 1; i <= b; i++)
        {
            if(i%2 == 0)
            {
                if(i%c == 0)
                {
                    System.out.println("\n");
                }else
                {
                    System.out.print("||");
                }
            }
            else
            {
                if(i%c == 0)
                {
                    System.out.println("\n");
                }else
                {
                    System.out.print("=");
                }
            }
        }
    }
}
