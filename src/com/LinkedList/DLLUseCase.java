package com.LinkedList;

public class DLLUseCase {
    public static void main(String[] args) {
//        DoublyLL list = new DoublyLL();
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.insertFirst(14);
//        list.insertFirst(15);
//        list.insert(15, 1000);
//        list.insertFirst(16);
//        list.insertLast(20);
//        list.display();
        CircularLL list = new CircularLL();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
//        list.delete(5);
        list.display();
    }
}
