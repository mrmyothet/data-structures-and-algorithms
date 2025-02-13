package com.myothet.dsa.two3fourtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoThreeFourTest {

    @Test
    public void test_Insert_Base_Case() {
        TwoThreeFourTree tree = new TwoThreeFourTree();
        
        tree.insert(100);
        
        Node root = tree.getRoot();
        assertEquals(100, root.keys[0]);
        
        assertEquals(2, root.noOfNodes);

    }
    
    @Test
    public void test_Insert_Small_BaseCase() {
        TwoThreeFourTree tree = new TwoThreeFourTree();
        
        tree.insert(100);
        tree.insert(90);
        
        Node root = tree.getRoot();
        assertEquals(90, root.keys[0]);
        assertEquals(100, root.keys[1]);
        
        assertEquals(3, root.noOfNodes);

    }
    
//    @Test
    public void test_Insert_Large_BaseCase() {
        TwoThreeFourTree tree = new TwoThreeFourTree();
        
        tree.insert(100);
        tree.insert(90);
        
        Node root = tree.getRoot();
        assertEquals(90, root.keys[0]);
        assertEquals(100, root.keys[1]);
        
        assertEquals(3, root.noOfNodes);

    }
}
