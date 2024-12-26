package com.Trees.binary_tree;

import java.util.Scanner;

public class BinaryTreeImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.populate(sc);
//        tree.display();
        tree.prettyPrint();
    }
}
