package com.myothet.dsa.datastructure;

import java.lang.RuntimeException;

public class Queue {

    int items[];
    int head = 0;
    int tail = 0;

    public Queue() {
        this.items = new int[10];
    }

    public int size() {
        // size = tail - head
        return tail - head;
    }

    public int peek() {
        return this.items[head];
    }

    public void enqueue(int item) {

        if (tail < items.length) {
            this.items[tail++] = item;
        } else {
            throw new RuntimeException("Queue is full");
        }
    }

    public int dequeue() {

        if (head < items.length && head < tail) {
            return this.items[head++];
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }
}
