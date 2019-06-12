package com.practice;

public class CycleInALinkedList {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null && slow != null) {
            if (fast == null) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
