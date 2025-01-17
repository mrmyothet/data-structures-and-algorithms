package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class PreOrderTraversal implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public PreOrderTraversal(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    public void TraversePreOrder() {
        Node current = this.tree.root;
        this.traversePreOrder(current);
    }

    public void traversePreOrder(Node node) {
        
        // Root - Left - Right 
        if (node != null) {
            System.out.println("Node: " + node.getValue());
            this.list.add(node);
        }

        if (node.getLeftChild() != null) {

            this.traversePreOrder(node.leftChild);
        }

        if (node.getRightChild() != null) {
            this.traversePreOrder(node.rightChild);
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
