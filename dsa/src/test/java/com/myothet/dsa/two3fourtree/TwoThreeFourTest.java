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

    @Test
    public void testInsertLargeBaseCase() {
        TwoThreeFourTree tree = new TwoThreeFourTree();
        tree.insert(100);
        tree.insert(120);

        Node root = tree.getRoot();//[100,120]
        assertEquals(100, root.keys[0]);
        assertEquals(120, root.keys[1]);
        assertEquals(3, root.noOfNodes);
    }

    /*
    @Test
    public void test_Split_Base_BaseCase() {
        TwoThreeFourTree tree = new TwoThreeFourTree();

        tree.insert(100);
        tree.insert(150);
        tree.insert(120);
        
        tree.getRoot();

        Node insertedNode = tree.insert(200);
        Node parent = insertedNode.parent;
        assertEquals(120, parent.keys[0]);

        Node root = tree.getRoot();

        Node child0 = parent.children.get(0);

//        assertEquals(3, root.noOfNodes);
    }
     */
//    @Test
    public void test_Split_Base_Case() {
        TwoThreeFourTree tree = new TwoThreeFourTree();

        tree.insert(100);
        tree.insert(150);
        tree.insert(120);

//        tree.getRoot();
        Node insertedNode = tree.insert(200);

        Node parent = insertedNode.splitWhenNoParent(insertedNode);
        assertEquals(2, parent.noOfNodes);
//        assertEquals(2, parent.children.size());

        Node child0 = parent.children.get(0);
        assertEquals(100, child0.keys[0]);

        Node child1 = parent.children.get(1);
        assertEquals(150, child1.keys[0]);
        assertEquals(200, child1.keys[1]);

    }
}
