package ru.geekbrains.les_4_4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int SIZE_X = 5;
    static int SIZE_Y = 5;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void playerStep() {
        int x,y;
        do {
            System.out.println("Ввести координаты: X Y (1-5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y,x,PLAYER_DOT);
    }

    public static void aiStep() {
        int x,y;
        do {
            System.out.println("Ввести кооррдинаты: X Y (1-5)");
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSym(y,x,AI_DOT);
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if(field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Проверка равности горизонтальных и вертикальных линий */

    public static boolean checkLines(char sym){
        boolean lineX = true;
        boolean lineY = true;
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                lineY = lineY & field[i][j] == sym;
                lineX = lineX & field[j][i] == sym;
            }
            if(lineX & lineY) return true;
        }
        return false;
    }

    /* Проверка равности диагоналей*/

    public static boolean checkDiagonals(char sym) {
        boolean toRight = true;
        boolean toLeft = true;
        for (int i = 0; i < SIZE_Y; i++) {
            toRight = toRight & (field[i][i] == sym);
            toLeft = toLeft & (field[5-i-1][i] == sym);
        }
        if (toRight || toLeft) return true;
        return false;
    }

    /* Ниже закомментированный код при поле 5х5 и количество клоток для выигрыша = 4*/

    /* Проверка равности горизонтальных и вертикальных линий 4х4 */

    /*public static boolean checkLines(char sym){
        boolean lineX = true;
        boolean lineY = true;
        for (int i = 0; i < SIZE_Y-1; i++) {
            for (int j = 0; j < SIZE_X-1; j++) {
                lineY = lineY & field[i][j] == sym;
                lineX = lineX & field[j][i] == sym;
            }
            if(lineX & lineY) return true;
        }
        return false;
    }

    public static boolean checkDiagonals(char sym) {
        boolean toRight = true;
        boolean toLeft = true;
        for (int i = 0; i < SIZE_Y-1; i++) {
            toRight = toRight & (field[i][i] == sym);
            toLeft = toLeft & (field[4-i-1][i] == sym);
        }
        if (toRight || toLeft) return true;
        return false;
    }*/

    /* проверка возможности хода */

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }

        return field[y][x] == EMPTY_DOT;
    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void checkTerminator(){
        boolean lineX = true;
    }

    public static void main(String[] args) {
        aGame();
    }


    public static void aGame() {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if(checkDiagonals(PLAYER_DOT) || checkLines(PLAYER_DOT)) {
                System.out.println("Пользователь выиграл");
                break;
            }
            if(isFieldFull()) {
                System.out.println("Заново!!");
                break;
            }
            aiStep();
            printField();
            if(checkDiagonals(AI_DOT) || checkLines(AI_DOT)) {
                System.out.println("Выграл бот!!");
                break;
            }
            if(isFieldFull()) {
                System.out.println("Заново!!");
                break;
            }
        }
    }
}
