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
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.Group;
//import javafx.scene.text.Text;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
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
/*
class Main{
    public static void main(String args[]){
    	
        Person lika = new Person();
        lika.setName("Lika");
        lika.setNumber("89259999999");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(lika);

        System.out.println(phoneBook);
    }
}

class Person {

    private String number;
    private String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class PhoneBook extends ArrayList<Person> {

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Person person : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Name:" + person.getName() + "\n");
            stringBuilder.append("Number:" + person.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }

}
*/

/*
1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна. 
Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели. 
Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter. 
При «отсылке» сообщение перекидывается из нижнего поля в центральное.
*/

/*public class Main{
    public static void main(String[] args) {
         new MyWindow();
    }
}

class MyWindow extends JFrame {
    public MyWindow() {
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(true);
        JPanel jPanel = new JPanel(new GridLayout(1, 1));
        JButton button1 = new JButton("Push me");
        JButton button2 = new JButton("Clear");
        JTextField jTextField1 = new JTextField();
        jPanel.add(jTextField1);
        jPanel.add(button1);
        jPanel.add(button2);
        add(jPanel, BorderLayout.SOUTH);
        

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField1.getText() + "\n");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
            }
        });

        jTextField1.addKeyListener(new KeyAdapter() {
		    public void keyReleased(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
					jTextArea.append(jTextField1.getText() + "\n");   
				}
		    }           
		});

        add(jTextArea, BorderLayout.NORTH);
        setBounds(500, 300, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}*/

/*
1. Необходимо написать два метода, которые делают следующее:

1) Создают одномерный длинный массив, например:

static final int size = 10000000;
static final int h = size / 2;
float[] arr = new float[size];

2) Заполняют этот массив единицами;
3) Засекают время выполнения: long a = System.currentTimeMillis();
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis();
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:

System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки:

System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);

Примечание:
System.arraycopy() – копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:

for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}

Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

*/
/*
public class Main{
    public static void main(String[] args) {
		simple();
		hard();
    }

   	static void simple(){
    	final int size = 100;
		final int h = size / 2;
		float[] arr = new float[size];
		long start = System.currentTimeMillis();

    	for(int i = 0; i < size; i++){
			arr[i] = (float)1;
			System.out.println(arr[i]);
		}

		for(int i = 0; i < size; i++){
			arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
			System.out.println(arr[i]);
		}

		long end = System.currentTimeMillis() - start;

		System.out.println(end);
    }

    static void hard(){
    	final int size = 100;
		final int h = size / 2;
		float[] arr = new float[size];
		float[] arr1 = new float[h];
		float[] arr2 = new float[h];

		long start2 = System.currentTimeMillis();

		for(int i = 0; i < size; i++){
			arr[i] = (float)1;
			System.out.println(arr[i]);
		}

		System.arraycopy(arr, 0, arr1, 0, h);
		System.arraycopy(arr, h, arr2, 0, h);

		for(int k = 0; k < h; k++){
			arr1[k] = (float)(arr1[k] * Math.sin(0.2f + k / 5) * Math.cos(0.2f + k / 5) * Math.cos(0.4f + k / 2));
			System.out.println(arr1[k]);
		}

		for(int j = 0; j < h; j++){
			arr2[j] = (float)(arr2[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j/ 2));
			System.out.println(arr2[j]);
		}

		//Объединение двух массивов

		System.arraycopy(arr1, 0, arr, 0, h);
		System.arraycopy(arr2, 0, arr, h, h);

		long end2 = System.currentTimeMillis() - start2;

		System.out.println(end2);

    }
}
*/
public class Main{
    public static void main(String[] args) {

    }
}
