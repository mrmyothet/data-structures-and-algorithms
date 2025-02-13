package com.myothet.dsa.two3fourtree;

public class TwoThreeFourTree {

    Node root;
    
    public void insert(int value)
    {
        if (root == null)
        {
            root = this.createTwoNode(null, value);
        }
        else
        {
            Node node = this.root;
            node.insert(value);
        }
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
