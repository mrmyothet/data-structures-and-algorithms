package com.myothet.dsa.datastructure;

public class Node {

    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    void setNext(Node second) {
        next = second;
    }

    int getValue() {
        return value;
    }

    public Node getNext() {
        return this.next;
    }
}
