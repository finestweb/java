package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        findTimeLinkedList();
        findTimeArrayList();
    }

    static void findTimeLinkedList(){

        List<Integer> list = new LinkedList<>();
        List<Integer> arraylist = new ArrayList<>();
        int[] integers = new int[5000000];

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            int a = (int) ( Math.random() * 1000 );
            list.add(a);
            integers[i] = list.get(i);
            arraylist.add(integers[i]);
        }
        //System.out.println(arraylist);

        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis()-start));
    }

    static void findTimeArrayList(){

        List<Integer> arraylist2 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        int[] integers2 = new int[5000000];

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            int a2 = (int) ( Math.random() * 1000 );
            arraylist2.add(a2);
            integers2[i] = arraylist2.get(i);
            list2.add(integers2[i]);
        }

        //System.out.println(list2);

        System.out.println("Время работы для ArrayList (в милисекундах) = " + (System.currentTimeMillis()-start2));
    }
}
