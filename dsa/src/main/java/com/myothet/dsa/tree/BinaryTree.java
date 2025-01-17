package com.myothet.dsa.tree;

public class BinaryTree {

    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    /*
    // loop version 
    public Node search(int item) {
        Node current = this.root;

        while (current != null) {
            if (current.getValue() == item) {
                return current;

            }

            if (current.getValue() < item) {
                current = current.getRightChild();
            } else if (current.getValue() > item) {
                current = current.getLeftChild();
            }
        }

        return null;
    }
     */
    public Node search(int item) {
        return this.searchRecursive(item, root);
    }

    public Node searchRecursive(int item, Node current) {
        if (current.getValue() == item) {
            return current;
        }

        if (current.getValue() < item) {
            return this.searchRecursive(item, current.getRightChild());
        } else if (current.getValue() > item) {
            return this.searchRecursive(item, current.getLeftChild());
        }

        return null;
    }

    public Node insert(int item) {
        Node insertedNode = new Node(item);

        Node current = root;
        Node parent = null;

        while (current != null) {
            if (current.getValue() < item) {
                current = current.getRightChild();
            }

            if (current.getValue() < item) {
                current = current.getLeftChild();
            }
        }

        if (parent.getValue() < item) {
            parent.setRightChild(insertedNode);
        }

        if (parent.getValue() > item) {
            parent.setLeftChild(insertedNode);
        }

        return insertedNode;
    }
}
