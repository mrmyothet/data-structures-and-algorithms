package com.myothet.dsa.datastructure;

public class QueueByLinkedList extends LinkedList {

    int size = 0;

    public QueueByLinkedList() {
        super();
    }

    public void enqueue(int value) {
        super.addLast(value);
        this.size++;
    }

    public int dequeue() {
        Node firstNode = super.getFirst();
        this.size--;

        super.delete(firstNode.getValue());

        return firstNode.getValue();

    }

    public int peek() {
        return super.getFirst().getValue();
    }

    public int size() {
        return this.size;
    }

}
