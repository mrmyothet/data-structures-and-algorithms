package com.myothet.dsa.two3fourtree;

import java.util.ArrayList;

public class Node {

    Node parent;

    Integer[] keys = new Integer[3];

    ArrayList<Node> children = new ArrayList<Node>();
    static int ORDER = 4;
    int noOfNodes = 1;
}
