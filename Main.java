/*В методе main LinkIteratorApp проверить все методы итератора.*/
package com.company;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");
        linkedList.add("7");

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }

        linkedList.remove(5);

        Iterator iterator2 = linkedList.iterator();


        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
