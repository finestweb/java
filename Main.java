
import java.util.Scanner;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {

    /*--------------------------------------------------------------------------------------*/

    /* Найти простые числа то 2 до 100 */
    
    /*int i, j;
    boolean isprime;
         for(i=2; i < 100; i++) {
         isprime = true;
             // проверить, делится ли число без остатка
             for (j=2; j<i; j++){
                // если число делится без остатка, значит, оно не простое
                if((i%j) == 0){
                    isprime = false;
                }
            }
            if (isprime){
                System.out.println(i + " - simple number.");
            }
        }
    }*/
    

    /*--------------------------------------------------------------------------------------*/


    /* Справочник */

    /* char choice, ignore;
    do 
    {
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while\n");
        System.out.print("Bыбepитe: ");

        choice = (char) System.in.read();
        
        do 
        {
            ignore = (char) System.in.read();
        }
        while(ignore != '\n');

    }while( choice < '1' | choice > '5');

    System.out.println("\n");
    switch(choice) 
        { 
            case '1':
            System.out.println("Oпepaтop if:\n");
            System.out.println("if(ycлoвиe) оператор;");
            System.out.println("else оператор;");
            break;
            case '2':
            System.out.println("Oпepaтop switch:\n");
            System.out.println("switch(выpaжeниe) {");
            System.out.println(" case константа:");
            System.out.println(" последовательность операторов");
            System.out.println(" break;");
            System.out.println(" // ... ");
            System.out.println("}");
            break;
            case '3':
            System.out.println("Oпepaтop for:\n");
            System.out.print("for(инициaлизaция; условие; итерация)");
            System.out.println(" оператор;");
            break;
            case '4':
            System.out.println("Oпepaтop while:\n");
            System.out.println("while(ycлoвиe) оператор;");
            break;
            case '5':
            System.out.println("Oпepaтop do-while:\n");
            System.out.println("do {");
            System.out.println(" оператор;");
            System.out.println("} while (условие};");
            break; 
        }*/


    /*--------------------------------------------------------------------------------------*/


    /*  Напишите программу, которая получает символы, введенные с клавиатуры, до
        тех пор, пока не встретится точка. Предусмотрите в программе счетчик пробелов.
        Сведения о количестве пробелов должны выводиться в конце программы. 
    */

    /*Scanner scanner = new Scanner(System.in);
    int number;

    do{
        System.out.println("Input number");
        number = scanner.nextInt();
        System.out.println(number);
    }
    while(number != 10);*/

    

    /*--------------------------------------------------------------------------------------*/

    /* ASII */

        System.out.println("Input symbols or symbol");
        Scanner scanner = new Scanner(System.in);
        String string;
        int count = 0;

        do{
            string = scanner.nextLine();
            char[] strToArray = string.toCharArray(); // Преобразуем строку string в массив символов (char)

            for(int i = 0; i < strToArray.length; i++) {
                if(Character.isUpperCase(strToArray[i]) == true){
                    System.out.print(Character.toLowerCase(strToArray[i])); 
                }else if(Character.isUpperCase(strToArray[i]) == false){
                    System.out.print(Character.toUpperCase(strToArray[i]));
                }else if(strToArray[i] == ' '){
                    count++;
                }
                System.out.println(count);
                
            } 

                
        }
        while(string != "no");
    }
}


