import java.util.Random;
import java.util.Scanner;
/* Написать методы, вычисляющий среднее арифметическое чисел от 1 до 50 */

/*class Main{
    public static void main(String args[]){
        arithmetic();
    }

    static void arithmetic(){
        int summ = 0;
        double half = 0;
        int min = 100;
        int max = 200;
        int diff = max - min;
        int[] number = new int[50];

        for(int i = 0; i < number.length; i++){
            Random random = new Random();
            number[i] = random.nextInt(diff + 1);
        }

        for(int i = 0; i < number.length; i++){
            summ = summ + number[i];
            System.out.print(" " + number[i]);
        }

        System.out.println(" " + summ);
        half = summ / number.length;
        System.out.println(half);
    }
}*/

/*Написать программу вычисляющую минимальный и максимальный элемент массива*/

/*class Main{
    public static void main(String args[]){
        arithmetic();
    }

    static void arithmetic(){
        int min = 100;
        int max = 200;
        int maxNumber = 10;
        int minNumber = 10;
        int diff = max - min;
        int[] number = new int[50];

        for(int i = 0; i < number.length; i++){
            Random random = new Random();
            number[i] = random.nextInt(diff + 1);
        }

        for(int i = 0; i < number.length; i++){
            System.out.print(" " + number[i]);
            if(number[i] > maxNumber){
                maxNumber = number[i];
            }else if(number[i] <= maxNumber){
                maxNumber = maxNumber;
            } 

            if(number[i] >= minNumber){
                minNumber = minNumber;
            }else if(number[i] < minNumber){
                minNumber = number[i];
            } 
        }

        System.out.print(" Max element " + maxNumber);
        System.out.print(" Min element " + minNumber);
    }
}*/

/* Написать метод определяющий,  является ли введенное пользователем число типа double или  целым. */

/*class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = scanner.nextLine();
        if (number.contains(".")) {
            System.out.println("Input number " + number + " is not all.");
        }
        if(Integer.parseInt(number)%2 == 0){
            System.out.println("Input number " + number + " is all.");
        } 
    }
}*/


