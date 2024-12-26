package com.Trees.binary_tree;

import java.util.Scanner;

public class CustomBinaryTree {
    public CustomBinaryTree() {

    }

    private static class Node {
        private int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //    Insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to insert the left of " + node.value + " : ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value left of " + node.value + " : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert the right of " + node.value + " : ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value right of " + node.value + " : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyPrint() {
        prettyPrint(root, 0);
    }

    private void prettyPrint(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyPrint(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyPrint(node.left, level + 1);
    }

}
