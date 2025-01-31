package com.myothet.dsa.tree;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeWithArrayPreOrderTraversalTest {

    BinaryTreeWithArray tree = new BinaryTreeWithArray();

    BinaryTreeWithArrayPreOrderTraversalTest() {

        tree.insert(17); //0
        tree.insert(15); //0
        tree.insert(30);
        tree.insert(13); //0
        tree.insert(16);
        tree.insert(18);
        tree.insert(19);
        tree.insert(35);

    }

    @Test
    public void testPreorder() {
        BinaryTreeArray_PreOrderTraversal traversal = new BinaryTreeArray_PreOrderTraversal(tree);
        Iterator<Integer> iterator = traversal.iterator();

        assertEquals(17, iterator.next());
        assertEquals(15, iterator.next());
        assertEquals(13, iterator.next());
        assertEquals(16, iterator.next());
        assertEquals(30, iterator.next());
        assertEquals(18, iterator.next());
        assertEquals(19, iterator.next());
        assertEquals(35, iterator.next());
    }

}
