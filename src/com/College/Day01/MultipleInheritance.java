package com.College.Day01;

public class MultipleInheritance {
    public static void main(String[] args) {
        char ch = '3';
        int n = ch - '0';
        System.out.println(n);
    }
}

class class3 implements class1, class2 {

    @Override
    public void print() {
        System.out.println("Hello world");
    }
}

interface class1 {
    void print();
}

interface class2 {
    void print();
}
