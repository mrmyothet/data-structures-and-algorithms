package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class PostOrderTraversal implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public PostOrderTraversal(BinaryTree tree) {
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

    public void traversePostOrder(Node node) {

        // usecase - generate byte code from syntax tree
        // Left - Right - Root 
        if (node.getLeftChild() != null) {

            this.traversePostOrder(node.leftChild);
        }

        if (node.getRightChild() != null) {
            this.traversePostOrder(node.rightChild);
        }

        if (node != null) {
            System.out.println("Node: " + node.getValue());
            this.list.add(node);
        }

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
