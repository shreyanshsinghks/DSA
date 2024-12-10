package com.LinkedList;

public class DoublyLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = head;

        if (head == null) {
            node.prev = null;
            head = node;
            node.next = null;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.prev = temp;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        while (last != null) {
            System.out.print(last.val + " -> ");
            ;
            last = last.prev;
        }
        System.out.println("null");
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Node does not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    private Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
