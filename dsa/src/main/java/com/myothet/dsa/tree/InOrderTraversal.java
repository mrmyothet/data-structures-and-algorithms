package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class InOrderTraversal implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public InOrderTraversal(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    public void TraverseInOrder() {
        Node current = this.tree.root;
        this.traverseInOrder(current);
    }

    public void traverseInOrder(Node node) {

        // Left - Root - Right
        if (node.getLeftChild() != null) {

            this.traverseInOrder(node.leftChild);
        }

        if (node != null) {
            System.out.println("Node: " + node.getValue());
            this.list.add(node);
        }

        if (node.getRightChild() != null) {
            this.traverseInOrder(node.rightChild);
        }

    }

    class TreeIterator implements Iterator<Node> {

        int currentIndex = 0;

        TreeIterator() {
            list = new ArrayList<Node>();
            TraverseInOrder();
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
