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

    public void traversePostOrder(Node node) {

        Stack<Node> stack = new Stack<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();

        Node current = node;

        while (current != null) {
            while (current.leftChild != null) {

                stack.push(current);
                System.out.println("push " + current.value);

                current = current.leftChild;
            }

            if (current.rightChild != null) {
                System.out.println("");
                current = current.rightChild;
            }

            System.out.println("Node " + current.value);
            list.add(current);

            if (!stack.isEmpty()) {

                Node backtrackNode = stack.pop();

                if (!visited.contains(backtrackNode)) {

                    System.out.println("Not visited, push " + backtrackNode.value);
                    stack.push(backtrackNode);
                    visited.add(backtrackNode);

                } else {

                    System.out.println("Node " + backtrackNode.value);
                    list.add(backtrackNode);

                    if (!stack.isEmpty()) {
                        current = stack.pop();
                        continue;
                    } else {
                        break;
                    }

                }

                if (backtrackNode.rightChild != null) {

                    System.out.println("Go to right child of " + backtrackNode.value);
                    current = backtrackNode.rightChild;
                }
            } else {
                break;
            }
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
