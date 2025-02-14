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
    public void test_Search_Level_1_Depth() {
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
    public void test_Search_Level_1_Depth_Small_Than_Root() {
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

    @Test
    public void test_Search_Level_1_Depth_Three_Tree() {
        /*
           [120, 150]
        [100]  [125]  [151]
        
         */

        Node parent = new Node();
        parent.insert(120);
        parent.insert(150);

        Node child_0 = new Node();
        child_0.insert(100);
        child_0.parent = parent;

        Node child_1 = new Node();
        child_1.insert(125);
        child_1.parent = parent;

        Node child_2 = new Node();
        child_2.insert(151);
        child_2.parent = parent;

        parent.children.add(child_0);
        parent.children.add(child_1);
        parent.children.add(child_2);

        Node searchNode = parent.search(100);
        assertEquals(child_0, searchNode);

        searchNode = parent.search(125);
        assertEquals(child_1, searchNode);

        searchNode = parent.search(150);
        assertEquals(child_2, searchNode);

    }

    @Test
    public void test_Search_Level_1_Depth_Four_Tree() {
        /*
           [120, 150, 200]
        [100]  [125]  [151] [205]
        
         */

        Node parent = new Node();
        parent.insert(120);
        parent.insert(150);

        Node child_0 = new Node();
        child_0.insert(100);
        child_0.parent = parent;

        Node child_1 = new Node();
        child_1.insert(125);
        child_1.parent = parent;

        Node child_2 = new Node();
        child_2.insert(151);
        child_2.parent = parent;
        
        Node child_3 = new Node();
        child_3.insert(205);
        child_3.parent = parent;

        parent.children.add(child_0);
        parent.children.add(child_1);
        parent.children.add(child_2);
        parent.children.add(child_3);

        Node searchNode = parent.search(100);
        assertEquals(child_0, searchNode);

        searchNode = parent.search(125);
        assertEquals(child_1, searchNode);

        searchNode = parent.search(150);
        assertEquals(child_2, searchNode);
        
        searchNode = parent.search(205);
        assertEquals(child_3, searchNode);

    }
}
