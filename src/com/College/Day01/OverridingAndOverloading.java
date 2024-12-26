package com.College.Day01;

public class OverridingAndOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Child child = new Child();
        System.out.println(c.add(2, 5));
        child.print();
    }
}


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Parent {
    public void print() {
        System.out.println("Hello parent");
    }
}

class Child extends Parent {
    @Override
    public void print() {
        System.out.println("Hello child");
    }
}