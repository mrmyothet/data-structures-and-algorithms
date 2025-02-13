package com.myothet.dsa.two3fourtree;

import java.util.ArrayList;

public class Node {

    Node parent;

    Integer[] keys = new Integer[3];

    ArrayList<Node> children = new ArrayList<Node>();
    static int ORDER = 4;
    int noOfNodes = 1;
    
    public Node insert(int value)
    {
        if(noOfNodes != 4)
        {
            int index =0;
            while(index < keys.length && keys[index] != null)
            {
                if (keys[index] > value)
                {
                    break;
                }
                index++;
            }
            
            for(int i=keys.length-1; i>index; i--)
            {
                keys[i] = keys[i-1];
            }
            
            keys[index] = value;
            noOfNodes++;
        }
        return this;
    }
}
