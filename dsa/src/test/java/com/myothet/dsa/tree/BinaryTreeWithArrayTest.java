package com.myothet.dsa.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeWithArrayTest {

    BinaryTreeWithArrayTest() {

    }

    @Test
    public void Test_Root_Node() {
        BinaryTreeWithArray tree = new BinaryTreeWithArray();

        int index = tree.insert(17);

        assertEquals(0, index);

    }

    @Test
    public void Test_Insert_Left() {
        BinaryTreeWithArray tree = new BinaryTreeWithArray();
        int index = tree.insert(17);
        assertEquals(0, index);

        index = tree.insert(15);
        assertEquals(1, index);

    }

    @Test
    public void Test_Insert_Right() {
        BinaryTreeWithArray tree = new BinaryTreeWithArray();
        int index = tree.insert(17);
        assertEquals(0, index);

        index = tree.insert(30);
        assertEquals(2, index);

    }

    @Test
    public void Test_Insert_Depth_Two() {
        BinaryTreeWithArray tree = new BinaryTreeWithArray();

        int index = tree.insert(17);
        assertEquals(0, index);

        index = tree.insert(15);
        assertEquals(1, index);

        index = tree.insert(30);
        assertEquals(2, index);

        index = tree.insert(13);
        assertEquals(3, index);

        index = tree.insert(16);
        assertEquals(4, index);

        index = tree.insert(18);
        assertEquals(5, index);

        index = tree.insert(35);
        assertEquals(6, index);

        index = tree.insert(19);
        assertEquals(12, index);

    }

    @Test
    public void Test_Search() {

        BinaryTreeWithArray tree = new BinaryTreeWithArray();
        
        tree.insert(17);
        tree.insert(15);
        tree.insert(30);
        tree.insert(13);
        tree.insert(16);
        tree.insert(18);
        tree.insert(35);
        tree.insert(19);
        
        assertEquals(0, tree.search(17));
        assertEquals(1, tree.search(15));
        assertEquals(3, tree.search(13));
        assertEquals(4, tree.search(16));
        assertEquals(5, tree.search(18));
        assertEquals(6, tree.search(35));
        
        assertEquals(12, tree.search(19));
        assertEquals(-1, tree.search(28));
        
        
    }
}
