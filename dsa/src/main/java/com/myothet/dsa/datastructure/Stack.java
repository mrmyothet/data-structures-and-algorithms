package com.myothet.dsa.datastructure;

public class Stack {

    int arr[];
    int top = -1;

    public Stack(int size) {
        arr = new int[size];
    }

    public void push(int item) {
        arr[++top] = item;
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public int pop()
    {
        return this.arr[top--];
    }
}
