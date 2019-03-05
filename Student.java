//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

public class Student
{  
    public static void main(String args[])
    {
        System.out.println("Введите оценку студента");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        if(p >= 0 && p <= 19){
        	System.out.println("Оценка F");
        }else if(p >= 20 && p <= 39){
        	System.out.println("Оценка E");
        }else if(p >= 40 && p <= 59){
            System.out.println("Оценка D");
        }else if(p >= 60 && p <= 74){
            System.out.println("Оценка C");
        }else if(p >= 75 && p <= 89){
            System.out.println("Оценка B");
        }else if(p >= 90 && p <= 100){
            System.out.println("Оценка A");
        }else{
            System.out.println("Вы батенька умны");
        }
    }
}
