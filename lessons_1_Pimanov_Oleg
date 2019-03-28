package ru.geekbrains.les_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* 2 */

        /* Примитивные типы данных */

        byte byteNumber = 50;
        short shortNumber  = 1250;
	    int number = 5;
	    float floatNumber = 5.5f;
	    long longNumber = 1050L;
	    double doubleNumber = 15.5;
	    char charSymbol = 'О';
	    boolean trueStory = true;
	    boolean falseStory = false;
        String name = "Олег";

	    /* Ссылочные типы данных */

        String nameLink = new String("Анастасия");

        /* 3 */

        /* Ввод чисел с клавиатуры*/
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        /* Вывод результата*/
        System.out.println(resultNumbers(a,b,c,d));

        /* 4 */

        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        /* Вывод результата*/
        System.out.println(resultSumLimit(e,f));

        /* 5 */

        int g = scanner.nextInt();

        System.out.println(plusNumber(g));

        /* 6 */

        int k = scanner.nextInt();

        System.out.println(plusNumberBoll(k));

        /* 7 */

        System.out.println("Введите свое имя");
        Scanner scannerNme = new Scanner(System.in);
        String nameMan = scannerNme.nextLine();
        System.out.println(myName(nameMan));

        /* 8 */


        System.out.println("Введите год");
        Scanner  scannerYear = new Scanner(System.in);
        int year = scannerYear.nextInt();
        System.out.println(yearHeight(year));

    }

    /* Возвращает результат */
    public static double resultNumbers(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    /*Возвращает результат суммы в пределах 10 и 20 включительно*/
    public static boolean resultSumLimit(double e, double f){
        double sum = e + f;
        if(sum >= 10 && sum <= 20){
           return true;
        }else{
            return false;
        }
    }

    /* Возвращает результат */
    public static String plusNumber(int g){
        if(g > 0 || g == 0){
            return "Положительное число";
        }else{
            return "Отрицательное число";
        }

    }

    /* Возвращает результат */
    public static boolean plusNumberBoll(int k){
        if(k < 0){
            return true;
        }else{
            return false;
        }

    }

    /* Возвращает результат */
    public static String myName(String nameMan){
        return "Привет, " + nameMan;
    }

    /* Возвращает какой сейчас год высокосный или нет */
    public static String yearHeight(int year){
        if(year%400 == 0){
            return "Количество дней в году: 366";
        }
        else if(year%400 != 0 && year%100 == 0) {
            return "Количество дней в году: 365";
        }
        else if(year%400 != 0 && year%100 != 0 && year%4 == 0){
            return "Количество дней в году: 366";
        }
        else{
            return "Количество дней в году: 365";
        }
    }
}
