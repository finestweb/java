//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

public class Main
{  
    public static void main(String args[])
    {
        int summ = 0;
        int count = 0;
        for(int i = 0; i <= 100; i++)
        {
            if(i%2 == 0)
            {
                summ = summ + i;
                count++;
            }
        }
        System.out.println("Сумма четных чисел " + summ);
        System.out.println("Количество четных чисел " + count);
        
    }
}
