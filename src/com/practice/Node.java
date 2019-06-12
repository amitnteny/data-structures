package com.practice;

/*
*Implementation of Bnary Search tree
*
*/
public class Node {
    private Node left, right;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {            //if value should be on the left subtree
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {                        //if value should be on the right subtree
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInorder() {
        if (left != null) {
            left.printInorder();
        }

        System.out.println(this.data);

        if (right != null) {
            right.printInorder();
        }
    }

    public void printPreorder() {
        System.out.println(this.data);
        if (left != null) {
            left.printInorder();
        }
        if (right != null) {
            right.printInorder();
        }
    }

    public void printPostorder() {
        if (left != null) {
            left.printInorder();
        }
        if (right != null) {
            right.printInorder();
        }
        System.out.println(this.data);
    }
}
