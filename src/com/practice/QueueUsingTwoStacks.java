package com.practice;

import java.util.Stack;

public class QueueUsingTwoStacks {

    public static class MyQueue<T> {
        private Stack<T> stackNewestOnTop = new Stack<>();
        private Stack<T> stackOldestOnTop = new Stack<>();

        /*
         * Add Item
         */
        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        /*
         * Get oldest item
         */
        public T peek() {
            //move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        /*
         *Get Oldest item and remove it
         */
        public T dequeue() {
            //move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.pop();
        }

        private void shiftStacks() {
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }
}
