
package com.myothet.dsa.datastructure;

import java.util.Iterator;

public class LinkedList implements Iterable{
    Node first;
    Node last;

    void addFirst(Node node) {
        
        node.setNext(first);
        first = node;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }
    
    class ListIterator implements Iterator
    {   
        Node current;
        public ListIterator()
        {
           this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            Node temp = current;
            
            if (current != null)
            {
            current = current.next;
            return temp;
            }
            
            return null;
        }
    }
    
    public static void main(String[] args )
    {
        
    }   
}