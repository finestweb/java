import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
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

/* 
   Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). 
   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). 
   Посчитать сколько раз встречается каждое слово.
*/

/* class Main{
    public static void main(String args[]){
 
        List<String> words = new ArrayList<>();
        words.add("Space"); 
        words.add("Sun");
        words.add("Earth");
        words.add("Mars");
        words.add("Moon");
        words.add("Pluton");
        words.add("Uran");
        words.add("Neptun");
        words.add("Mars");
        words.add("Sun");
        words.add("Space");
        words.add("Space");
        int count = 0;
        int countn = 0;

        for ( String w: words)
            System.out.print(w +",");
        
        System.out.println("\r" );

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        Integer item;
       
        for (String word : words) {
            
            item = hashMap.get(word);
            
            if (item == null){
                hashMap.put(word, 1); // если нет в списке то добавить со значением 1
            }
            else{
                hashMap.put(word, item + 1); // если есть такая, то +1
            }
        }

        System.out.println("-----------------------------------------\r");

        System.out.println("All words in list: " + words.size());

        System.out.println("-----------------------------------------\r");

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() == 1){
                count++;
                System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
            }
        }
        System.out.println("Unicum words in list: " + count);

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() != 1){
                countn++;
                System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
            }
        }

        System.out.println("Not unicum words in list: " + countn);

        System.out.println("-----------------------------------------\r");

        System.out.println("Words and count:");
        System.out.println(hashMap);

        System.out.println("-----------------------------------------\r");
    }
}
*/

/*
Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. 
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. 
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), 
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля 
(имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать 
(в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
*/

class Main{
    public static void main(String args[]){

    }
}



