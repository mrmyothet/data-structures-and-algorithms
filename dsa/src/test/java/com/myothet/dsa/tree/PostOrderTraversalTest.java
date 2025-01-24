package com.myothet.dsa.tree;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PostOrderTraversalTest {

    @Test
    public void testBaseCase() {
        BinaryTree tree;

        Node root = new Node(17);

        tree = new BinaryTree(root);

        tree.insert(15);
        tree.insert(30);

        BinaryTreeTraversal traversal = new PostOrderTraversalIterative(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 13, 17, 30
        assertEquals(15, iterator.next().value);
        assertEquals(30, iterator.next().value);
        assertEquals(17, iterator.next().value);
        assertEquals(false, iterator.next());

    }

    @Test
    public void testBaseCase_2() {
        BinaryTree tree;

        Node root = new Node(17);

        tree = new BinaryTree(root);

        tree.insert(15);

        BinaryTreeTraversal traversal = new PostOrderTraversalIterative(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 13, 17, 30
        assertEquals(15, iterator.next().value);
        assertEquals(17, iterator.next().value);
        assertEquals(false, iterator.next());

    }

    @Test
    public void testBaseCase_3() {
        BinaryTree tree;

        Node root = new Node(17);

        tree = new BinaryTree(root);

        tree.insert(30);

        BinaryTreeTraversal traversal = new PostOrderTraversalIterative(tree);
        Iterator<Node> iterator = traversal.iterator();

        // 13, 17, 30
        assertEquals(30, iterator.next().value);
        assertEquals(17, iterator.next().value);
        assertEquals(false, iterator.next());

    }

}
