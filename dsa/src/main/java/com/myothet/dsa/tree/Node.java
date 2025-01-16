
package com.myothet.dsa.tree;

public class Node {
    int value;
    
    Node leftChild;
    Node rightChild;

    Node(int value) {
        
        this.value = value;
    }
    
    // design pattern - composite pattern
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return this.value;
    }

    void setRightChild(Node right) {
        this.rightChild = right;
    }

    void setLeftChild(Node left) {
        this.leftChild = left;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }
    
    
}
