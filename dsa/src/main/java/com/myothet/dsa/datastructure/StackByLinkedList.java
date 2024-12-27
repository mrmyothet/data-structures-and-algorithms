package com.myothet.dsa.datastructure;

public class StackByLinkedList extends LinkedList {

    int size = 0;

    StackByLinkedList() {
        super();
    }

    public void push(int value) {
        super.addLast(value);
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public int peek() {
        return this.getLast().getValue();
    }

    public void deleteLast() {
        //        [1,1,3,1]
        // want to delete 1 - must be delete last 

        Node lastNode = this.getLast();

        Node current = this.getFirst();
        Node previous = null;
        while (current != lastNode) {
            previous = current;
            current = current.getNext();
        }

        if (previous != null) {
            previous.setNext(null);
        }

        super.last = previous;

    }

    public int pop() {
        Node lastNode = this.getLast();
        this.deleteLast();
        this.size--;

        return lastNode.getValue();
    }
}
