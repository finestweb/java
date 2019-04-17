package ru.geekbrains.les_5_5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str1 = " Предложение один    Теперь предложение два     Предложение три";

        String str2 = str1.replaceAll(" +", " ");
        String str3 = str2.trim();
        String str4 = ".";

        StringBuilder stringBuilder = new StringBuilder(str3);

        for(int i = 1; i < str3.length(); i++) {
            if(str3.charAt(i) >= 'A' && str3.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i-1, '.');
            }
        }

        System.out.println(stringBuilder.toString() + str4);


    }
}
