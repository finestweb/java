/*3. Создать класс для реализации дека.*/
package com.company;
import java.util.*;
public class Deque {

    public static void main(String[] args)
    {
        Deque<String> deque = new LinkedList<>();

        deque.add("Собака (В конец)"); // добавляем в конец
        deque.addFirst("Кошка (Начало)");
        deque.addLast("Коза (Конец)");
        deque.push("Корова (Начало)"); //добавляем в начало
        deque.offer("Теленок (Конец)");
        deque.offerFirst("Поросенок (Начало)");
        deque.offerLast("Лошадь (конец)");

        System.out.println(deque + "\n");

        // Peek возврат элементов без удаления
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);

        System.out.println(deque + "\n");

        // Pop возврат с удалением
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);

        System.out.println(deque + "\n");

        // Удаление последнего и первого элементов
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Очередь после удаления " +
                "последнего и первого элементов: " + deque);

    }
}
