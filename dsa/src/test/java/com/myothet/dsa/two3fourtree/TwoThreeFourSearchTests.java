package com.myothet.dsa.two3fourtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoThreeFourSearchTests {

    @Test
    public void test_Search_Node() {
        Node node = new Node();
        node.insert(120);

        Node searchNode = node.search(120);
        assertEquals(node, searchNode);
    }
    
    @Test
    public void test_Search_Negative_Case() {
        Node node = new Node();
        node.insert(100);
        node.insert(120);
        node.insert(150);

        Node searchNode = node.search(90);
        assertEquals(null, searchNode);
    }
    
    @Test
    public void test_Search_Level_1_Depth()
    {
        /*
           [120]
        [100]  [150]
        
        */
        
        Node parent = new Node();
        parent.insert(120);
        
        Node child0 = new Node();
        child0.insert(100);
        child0.parent = parent;
        
        Node child1 = new Node();
        child1.insert(150);
        child1.parent = parent;
        
        parent.children.add(child0);
        parent.children.add(child1);
        
        Node searchNode = parent.search(150);
        assertEquals(child1, searchNode);
    }
    
    @Test
    public void test_Search_Level_1_Depth_Small_Than_Root()
    {
        /*
           [120]
        [100]  [150]
        
        */
        
        Node parent = new Node();
        parent.insert(120);
        
        Node child0 = new Node();
        child0.insert(100);
        child0.parent = parent;
        
        Node child1 = new Node();
        child1.insert(150);
        child1.parent = parent;
        
        parent.children.add(child0);
        parent.children.add(child1);
        
        Node searchNode = parent.search(100);
        assertEquals(child0, searchNode);
    }
}
