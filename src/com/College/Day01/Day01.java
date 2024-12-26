package com.College.Day01;

public class Day01 extends Animal {
    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.eat();
        anm.fly();
    }
}

class Animal extends Bird {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Bird {
    void fly() {
        System.out.println("This bird can fly.");
    }
}