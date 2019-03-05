//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

public class Main
{  
    public static void main(String args[])
    {
        System.out.println("Введите сторону а");
        System.out.println("Введите сторону b");
        System.out.println("Введите сторону c");
        System.out.println("Введите сторону d");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(a > c || b > d){
        	System.out.println("0");
        }else{
        	System.out.println("1");
        }
    }
}
