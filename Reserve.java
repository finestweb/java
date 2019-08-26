/*
2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
*/
package com.company;

import java.util.Stack;

public class Reserve {

    public static void main(String[] args)
    {
        reverseString("Привет");
    }

    public static void reverseString(String str) {
        Stack<Character> beginner = new Stack<>();
        for (Character character : str.toCharArray()) {
            beginner.add(character);
        }
        StringBuilder result = new StringBuilder();
        while (beginner.size() > 0) {
            result.append(beginner.pop());
        }
        System.out.println(result);
    }
}
