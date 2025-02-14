package com.myothet.dsa.two3fourtree;

public class TwoThreeFourTree {

    Node root;
    
    public Node insert(int value)
    {
        Node insertedNode = new Node();
        if (root == null)
        {
            root = this.createTwoNode(null, value);
        }
        else
        {
            Node node = this.root;
            return node.insert(value);
        }
        return insertedNode;
    }
    
    public Node createTwoNode(Node parent, int value)
    {
        Node node = new Node();
        node.keys[0] = value;
        node.parent = parent;
        node.noOfNodes++;
        return node;
    }
    
    public Node getRoot()
    {
        return this.root;
    }

}
