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
}
