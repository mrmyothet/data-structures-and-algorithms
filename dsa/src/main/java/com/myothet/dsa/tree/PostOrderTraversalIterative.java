package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PostOrderTraversalIterative implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public PostOrderTraversalIterative(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator();
    }

    public void TraversePostOrder() {
        Node current = this.tree.root;
        this.traversePostOrder(current);
    }

    /*
    resultStack = []
    push root into resultStack
    while (recursiveStack not empty)
    {
        item= recursiveStack.pop()
        push into resultStack
        if left
        recursiveStack.push(left)
        if right
        recursiveStack.push(right)
    }
    reverse resultStack
    
     */
    public void traversePostOrder(Node node) {
        Stack<Node> recursiveStack = new Stack<>();
        Stack<Node> recursiveResultStack = new Stack<>();

        Node current = node;
        
        

    }

    class TreeIterator implements Iterator<Node> {

        int currentIndex = 0;

        TreeIterator() {
            list = new ArrayList<Node>();
            TraversePostOrder();
        }

        @Override
        public boolean hasNext() {
            return currentIndex <= list.size() - 1;
        }

        @Override
        public Node next() {
            return list.get(currentIndex++);
        }

    }

}
