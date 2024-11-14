package com.LinkedList;

public class LinkedListPart1 {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertLast(99);
        list.insertAtIndex(100, 3);
        list.displayLL();
        System.out.println(list.deleteFirst());
        list.deleteLast();
        list.displayLL();
    }
}
