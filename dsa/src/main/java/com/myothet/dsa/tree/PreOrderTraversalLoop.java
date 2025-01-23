package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PreOrderTraversalLoop implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public PreOrderTraversalLoop(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator();
    }

    public void TraversePreOrder() {
        Node current = this.tree.root;
        this.traversePreOrder(current);
    }

    public void traversePreOrder(Node node) {

        // Root - Left - Right 
        Node current = node;

        Stack<Node> stack = new Stack<Node>();

        while (current != null) {

            this.list.add(current);
            System.out.println("Node " + current.getValue());

            if (current.rightChild != null) {
                stack.push(current.rightChild);
            }

            if (current.leftChild != null) {
                current = current.leftChild;
            } else if (!stack.isEmpty()) {
                current = stack.pop();
            } else {
                break;
            }
        }

    }

    class TreeIterator implements Iterator<Node> {

        int currentIndex = 0;

        TreeIterator() {
            list = new ArrayList<Node>();
            TraversePreOrder();
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
