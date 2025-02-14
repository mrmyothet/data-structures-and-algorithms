package com.myothet.dsa.two3fourtree;

import java.util.ArrayList;

public class Node {

    Node parent;

    Integer[] keys = new Integer[3];

    ArrayList<Node> children = new ArrayList<Node>();
    static int ORDER = 4;
    int noOfNodes = 1;

    public Node insert(int value) {
        if (noOfNodes != 4)//Normal insert
        {
            return simpleInsert(value);
        } else {
            //split case
            Node splitParent = splitNode(this);

            // we need to find leaf node to insert
        }

        return this;
    }

    private Node simpleInsert(int value) {
        int index = 0;
        while (index < keys.length && keys[index] != null) {
            if (keys[index] > value) {
                break;
            }
            index++;
        }
        for (int i = keys.length - 1; i > index; i--) {
            keys[i] = keys[i - 1];
        }
        keys[index] = value;
        this.noOfNodes++;

        return this;
    }

    Node splitNode(Node node) {
        Node returnedNode = new Node();
        if (node.parent == null) {
            returnedNode = splitWhenNoParent(node);
        }

        return returnedNode;
    }

    public Node splitWhenNoParent(Node node) {
        Node parent = new Node();
        parent.keys[0] = node.keys[1];

        // split into child 
        Node child0 = new Node();
        child0.parent = parent;

        child0.keys[0] = node.keys[0];

        Node child1 = new Node();
        child1.parent = parent;
        child1.keys[0] = node.keys[2];

        parent.children.add(child0);
        parent.children.add(child1);

        return parent;
    }

    public Node search(int value) {
        /*
            [120]-> insert 200
        [100]  [150]
        
        result [150]
        
        Node တွေကို manually create 
         */

        Node current = this;

        int index = 0;
        while (index < keys.length && keys[index] != null) {

            if (current.keys[index] == value) {
                return current;
            }

            if (keys[index] > value) {
                break;
            }
            index++;

        }

        // go to children
        if (current.children.size() > 0) {
            System.out.println("Index " + index);
            
            if(current.keys[index] == null)
            {
                return current.children.get(index);
            }
            else
            {
            return current.children.get(index);
            }
            
            
        } else {
            return null;
        }

//        return current;
    }
}
