package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //simple();
        hard();
    }

    static void simple(){
        final int size2 = 1000000;
        float[] arr2 = new float[size2];
        long start2 = System.currentTimeMillis();

        //Простое наполнение массива 1

        for(int i = 0; i < size2; i++){
            arr2[i] = (float)1;
            //System.out.println(arr2[i]);
        }

        //Наполнение массива случайными числами

        for(int i = 0; i < size2; i++){
            arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            //System.out.println(arr2[i]);
        }



        boolean sorted = false;
        float temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(arr2));

        long end2 = System.currentTimeMillis() - start2;

        System.out.println(end2);
    }

    //Разбиение массива на 2, потои воссоединение

    static void hard(){
        final int size = 1000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long start2 = System.currentTimeMillis();

        //Простое наполнение массива 1

        for(int i = 0; i < size; i++){
            arr[i] = (float)1;
            System.out.println(arr[i]);
        }

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        for(int k = 0; k < h; k++){
            arr1[k] = (float)(arr1[k] * Math.sin(0.2f + k / 5) * Math.cos(0.2f + k / 5) * Math.cos(0.4f + k / 2));
            //System.out.println(arr1[k]);
        }

        for(int j = 0; j < h; j++){
            arr2[j] = (float)(arr2[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j/ 2));
            //System.out.println(arr2[j]);
        }

        //Объединение двух массивов

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        boolean sorted = false;
        float temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        long end2 = System.currentTimeMillis() - start2;

        System.out.println(end2);

    }
}
