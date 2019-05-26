package Potok_2_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayDataException.myNewMassiveEr();
        MyArraySizeException.myNewMassive();
    }
}

class MassiveGo{
    static void createMassive() {
        int min = 100;
        int max = 200;
        int diff = max - min;
        int summ = 0;
        String[][] massiveNumber = new String[4][4];
        for (int i = 0; i < massiveNumber.length; i++) {
            for (int j = 0; j < massiveNumber.length; j++) {
                Random random = new Random();
                massiveNumber[i][j] = Integer.toString(random.nextInt(diff + 1));
            }
        }

        /*
            Для проверки условий исключений
        */

        //massiveNumber[10][1] = "10";
        //massiveNumber[1][1] = "10sfsfsf";

        for (int i = 0; i < massiveNumber.length; i++) {
            for (int j = 0; j < massiveNumber.length; j++) {
                summ = summ + Integer.parseInt(massiveNumber[i][j].trim());
                System.out.print(massiveNumber[i][j] + "\t");
            }
        }
        System.out.println(summ);
    }
}

/* Исключение на то, что не все элементы в массиве числа*/

class MyArrayDataException{
    static void myNewMassiveEr() {
        try {
            MassiveGo.createMassive();
            System.out.println("Все числа");
        } catch (NumberFormatException nfe) {
            System.out.println("Не все числа числа");
        }
    }
}

/* Исключение на то, что индекс элента массива запредельный*/

class MyArraySizeException {
    static void myNewMassive() {
        try {
            MassiveGo.createMassive();
            System.out.println("Все числа существуют");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элемент не существует в массиве");
        }
    }
}
