package com.myothet.dsa.tree;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeTraversalTests {

    BinaryTree tree;

    public BinaryTreeTraversalTests() {
        Node root = new Node(17);

        tree = new BinaryTree(root);

        // insert by level-order-traversal
        tree.insert(15);
        tree.insert(30);

        tree.insert(13);
        tree.insert(16);
        tree.insert(18);
        tree.insert(35);
        tree.insert(19);
    }

    @Test
    public void Test_PreOrder_Traversal() {
        BinaryTreeTraversal traversal = new PreOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 17, 15, 13, 16, 30, 18, 19, 35
        assertEquals(17, iterator.next().value);
        assertEquals(15, iterator.next().value);
        assertEquals(13, iterator.next().value);
        assertEquals(16, iterator.next().value);
        assertEquals(30, iterator.next().value);
        assertEquals(18, iterator.next().value);
        assertEquals(19, iterator.next().value);
        assertEquals(35, iterator.next().value);
    }
    
    @Test
    public void Test_PreOrder_Traversal_Loop() {
        BinaryTreeTraversal traversal = new PreOrderTraversalLoop(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 17, 15, 13, 16, 30, 18, 19, 35
        assertEquals(17, iterator.next().value);
        assertEquals(15, iterator.next().value);
        assertEquals(13, iterator.next().value);
        assertEquals(16, iterator.next().value);
        assertEquals(30, iterator.next().value);
        assertEquals(18, iterator.next().value);
        assertEquals(19, iterator.next().value);
        assertEquals(35, iterator.next().value);
    }

    @Test
    public void Test_InOrder_Traversal() {
        BinaryTreeTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 13,15,16,17,18,19,30,35
        assertEquals(13, iterator.next().value);
        assertEquals(15, iterator.next().value);
        assertEquals(16, iterator.next().value);
        assertEquals(17, iterator.next().value);
        assertEquals(18, iterator.next().value);
        assertEquals(19, iterator.next().value);
        assertEquals(30, iterator.next().value);
        assertEquals(35, iterator.next().value);
    }

    @Test
    public void Test_PostOrder_Traversal() {
        BinaryTreeTraversal traversal = new PostOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 13, 16, 15, 19, 18, 35, 30, 17
        assertEquals(13, iterator.next().value);
        assertEquals(16, iterator.next().value);
        assertEquals(15, iterator.next().value);
        assertEquals(19, iterator.next().value);
        assertEquals(18, iterator.next().value);
        assertEquals(35, iterator.next().value);
        assertEquals(30, iterator.next().value);
        assertEquals(17, iterator.next().value);
    }
}
