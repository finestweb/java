/*
1. Реализовать рассмотренные структуры данных в консольных программах.
*/

package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++) {
                list.add(i, reader.readLine());
            }

            for (int i = 0; i < 13; i++) {
                String s = list.get(4);
                list.add(0, s);
                list.remove(5);
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }

            list.add("Мурзик");
            list.add("Рыжик");
            list.set(0, "Собачка");

            System.out.println(list.toString());
    }
}
