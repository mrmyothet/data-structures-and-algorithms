package com.myothet.dsa.datastructure;

import java.util.Iterator;

public class LinkedList implements Iterable {

    Node first;
    Node last;

    LinkedList() {

    }

    LinkedList(Node node) {
        this.first = node;
        this.last = node;
    }

    void addFirst(int value) {
        Node node = new Node(value);
        addFirst(node);
    }

    void addFirst(Node node) {
        if (this.first == null) {
            this.first = node;
            this.last = node;
        } else {

            node.setNext(this.first);
            this.first = node;
        }
    }

    void addLast(int value) {
        Node node = new Node(value);
        addLast(node);
    }

    void addLast(Node node) {

        if (this.last == null)// first time
        {
            this.first = node;
            this.last = node;

        } else {
            this.last.setNext(node);
            this.last = node;
        }
    }

    public Node find(int item) {
        Node current = this.first;

        while (current != null) {
            int currentValue = current.value;
            if (currentValue == item) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

//    public Node delete(int item) {
//        Node nodeToDelete = this.find(item);
//
//        if (nodeToDelete != null) {
//
//            if (first == nodeToDelete) {
//                // first == last => single item
//                if (first == last) {
//                    this.first = null;
//                    this.last = null;
//                    return nodeToDelete;
//                }
//            }//many items
//            else {
//                this.first = nodeToDelete.next;
//                return nodeToDelete;
//            }
//        }
//
//        return nodeToDelete;
//    }
    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator {

        Node current;

        public ListIterator() {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            Node temp = current;

            if (current != null) {
                current = current.next;
                return temp;
            }

            return null;
        }
    }

    public Node getFirst() {
        return this.first;
    }

    public Node getLast() {
        return this.last;
    }

    public Node delete(int item) {
        Node previous = null;
        Node current = first;
        Node nodeToDelete = null;

        while (current != null) {
            if (current.value == item) {
                //Found node to be deleted
                nodeToDelete = current;
                if (first == current)// first node
                {
                    this.first = nodeToDelete.next;
                    return nodeToDelete;

                } else if (previous != null) {
                    previous.next = nodeToDelete.next;

                    if (nodeToDelete.next == null) {
                        this.last = previous;
                    }
                    return nodeToDelete;
                }
            }
            previous = current;
            current = current.next;
        }

        return null;
    }
}
