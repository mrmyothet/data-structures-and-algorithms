package com.myothet.dsa.tree;

public class Node {

    int value;

    Node leftChild;
    Node rightChild;

    Node parent;

    public void setParent(Node parentNode) {
        this.parent = parentNode;
    }

    public Node getParent() {
        return this.parent;
    }

    Node(int value) {

        this.value = value;
    }

    // design pattern - composite pattern
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    void setRightChild(Node child) {
        this.rightChild = child;
        
        this.rightChild.setParent(this);
        
        
    }

    void setLeftChild(Node child) {
        this.leftChild = child;
        
        this.leftChild.setParent(this);
        
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

}
