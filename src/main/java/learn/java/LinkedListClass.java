package learn.java;

import java.util.*;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.addFirst(10);
        integerLinkedList.addLast(20);
        integerLinkedList.push(50);
        System.out.println("integerLinkedList: " + integerLinkedList);



    }
}

