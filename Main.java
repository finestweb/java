package ru.geekbrains.les_3;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {

        /*1. Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число. При каждой попытке
        компьютер должен сообщить больше ли указанное пользователем число чем
        загаданное, или меньше. После победы или проигрыша выводится запрос –
        «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */

        //selectionInNumber()


        /*2. Создать массив из слов String[] words = {"apple", "orange", "lemon",
        "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
        grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы*/

        selectionSecretWord();

    }

    static void selectionInNumber()
    {

        Scanner scanner = new Scanner(System.in);
        boolean isEndGame = false;
        int yourNumberChoiseGame;

        selectionNumber();

        do {
            System.out.println("Повторить игру еще раз? (0 или 1)");

            while (!scanner.hasNextInt()) {
                System.out.println("Не число. Введите число от 0 до 1");
                scanner.next();
            }

            yourNumberChoiseGame = scanner.nextInt();

            if (yourNumberChoiseGame == 0) {
                System.out.println("Игра закончена по требованию игрока");
                isEndGame = true;
            } else if (yourNumberChoiseGame == 1) {
                selectionNumber();
            }
        } while (!isEndGame);
    }

    private static void selectionNumber() {
        int random = (int) (Math.random() * 9);
        Scanner scanner = new Scanner(System.in);
        int yourNumber;

        boolean yourWinner = false;

        for (int i = 1; i < 3; i++) {
            System.out.println("Введите число в диапазоне от 0 до 9");

            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число. Введите число в диапазоне от 0 до 9");
                scanner.next();
            } else {
                yourNumber = scanner.nextInt();

                if (yourNumber == random) {
                    yourWinner = true;
                    break;
                } else if (yourNumber > random) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
            }
        }

        if (yourWinner) {
            System.out.println("Вы победили");
        }
        else{
            System.out.println("Вы проиграли");
        }
    }


    static void selectionSecretWord()
    {
        String[] words =
        {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"
        };
        Scanner scanner = new Scanner(System.in);
        int randomNumberWord = (int) (Math.random() * 24); // Рандомное симло от 0 до 24
        String randomWord = words[randomNumberWord]; // Cлучайный выбор слова в массиве
        String yourSecretWords;
        /*System.out.println(randomNumberWord);
        System.out.println(randomWord);*/
        int symbols;
        String chars;
        int difference;
        String placeholder = "#";
        boolean isYouAreWin = false;





        do
            {
            System.out.println("Введите слово:");
            symbols = 0;

            while (!scanner.hasNext()) {
                System.out.println("Введите слово:");
                scanner.next();
            }

            yourSecretWords = scanner.nextLine().toLowerCase();
            chars = "";

            for (int i = 0; i < yourSecretWords.length() && i < randomWord.length(); i++)
            {
                if (yourSecretWords.charAt(i) == randomWord.charAt(i)) {
                    chars += yourSecretWords.charAt(i);
                    symbols++;
                } else {
                    chars += placeholder;
                }
            }

            difference = 15 - chars.length();
            for (int i = 0; i < difference; i++)
            {
                chars += placeholder;
            }

            if (yourSecretWords.equals(randomWord))
            {
                isYouAreWin = true;
                System.out.println("Вы победили");
            } else if (symbols > 0) {
                System.out.println(chars);
            } else {
                System.out.println("нет совпадений\n");
            }

        } while (true);
    }
}
