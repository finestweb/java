package ru.geekbrains.les_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* -1- */

        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                numbers[i] = 1;
            }else{
                numbers[i] = 0;
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println("");

        /* -2- */

        int[] numbers2 = new int[8];
        numbers2[0] = 0;
        System.out.print(numbers2[0] + " ");
        for(int j = 1; j < numbers2.length; j++) {
            numbers2[j] = numbers2[j-1] + 3;
            System.out.print(numbers2[j] + " ");
        }

        System.out.println("");

        /* -3- */

        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int k = 0; k < numbers3.length; k++){
            if(numbers3[k] < 6){
                numbers3[k] = numbers3[k] * 2;
            }
            System.out.print(numbers3[k] + " ");
        }

        System.out.println("");

        /* -4- */

        int[][] mnogo = new int[10][10];

        for(int i = 0; i < mnogo.length; i++){
            for(int j = 0; j < mnogo.length; j++) {
                if(i == j){
                    System.out.print("1");
                }else{
                    System.out.print(mnogo[i][j]);
                }

            }
            System.out.println();
        }

        /* -5- */

        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = num[0];
        int min = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);

        /* -6- */

        int[] sixTask = {1, 1, 1, 2, 1};
        checkBalance(sixTask);


        /* -7- */
        /* Честно смог сдвинуть массив только вправои только на много шагов, но только вправо*/

        int[] sevenTask = {5,6,8,9,10,56,96,36,25,36};
        int count = 10;
        for(int i = 1; i <= count; i++){
            if(i == count){
                stepItem(sevenTask);
                System.out.println();
            }
        }
    }

    public static void checkBalance(int[] sixTask){
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        boolean result = true;
        for(int i = 0; i < sixTask.length; i++){
            sum = sum + sixTask[i];
        }
        int divideSum = sum / 2;
        for(int i = 0; i < sixTask.length; i++){
            sum2 = sum2 + sixTask[i];
            sum3 = sum - sum2;
            if(sum2 == sum3){
                System.out.println("Сумма левой и правой части равны");

            }
        }
    }

    public static void stepItem(int[] sevenTask){
        int step = 1;
        int last = sevenTask[sevenTask.length - step];
        for (int i = sevenTask.length - step; i > 0; i--)
        {
            sevenTask[i] = sevenTask[i - step];
        }
        sevenTask[0] = last;
        for (int i = 0; i < sevenTask.length; i++)
        {
            System.out.print(sevenTask[i]);
            System.out.print(' ');
        }
    }

}
