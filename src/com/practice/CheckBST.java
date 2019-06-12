package com.practice;

public class CheckBST {

    private static class Node {
        private Node left;
        private Node right;
        private int data;
        private Node(int data) {
            this.data = data;
        }
    }
    public boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Node root, int minValue, int maxValue) { //inclusive ranges
        if (root == null) {
            return false;
        }
        if (root.data <= minValue || root.data >= maxValue){
            return false;
        }
        return checkBST(root.left, minValue, root.data -1) && checkBST(root.right, root.data + 1 , maxValue);
    }
}
