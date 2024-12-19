package com.myothet.dsa.datastructure;

public class CircularQueue extends Queue {

    public CircularQueue() {
        super();
    }

    /*
    
    enqueue 
    tail = 0 
    [1,2,3] 
    tail = 3
    
    next -> 0 
    tail = tail % items.length 
    
     */
    public void enqueue(int item) {

        tail = tail % items.length;
        this.items[tail++] = item;
    }

    public int dequeue() {
        return this.items[head++];

    }

    public int size() {
        return tail - head;
    }

}
