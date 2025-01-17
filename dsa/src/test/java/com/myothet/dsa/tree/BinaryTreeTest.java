package com.myothet.dsa.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    public BinaryTree GetBinaryTree() {
        Node root = new Node(7);
        Node left = new Node(6);
        Node right = new Node(8);

        root.setLeftChild(left);
        root.setRightChild(right);

        BinaryTree tree = new BinaryTree(root);

        return tree;

    }
    
    @Test
    public BinaryTree GetBinaryTreeForInsert() {
        Node root = new Node(60);
        Node left1 = new Node(40);
        
        Node left2 = new Node(30);
        Node right2 = new Node(50);

        root.setLeftChild(left1);
        
        left1.setLeftChild(left2);
        left1.setRightChild(right2);

        BinaryTree tree = new BinaryTree(root);

        return tree;

    }
    
    @Test
    public BinaryTree GetBinaryTreeForInsertNode() {
        Node root = new Node(17);
        
        Node left1 = new Node(15);
        Node right1 = new Node(30);
        
        Node left2 = new Node(13);
        Node right2 = new Node(16);

        root.setLeftChild(left1);
        root.setRightChild(right1);
        
        left1.setLeftChild(left2);
        left1.setRightChild(right2);
        
        Node right1_left = new Node(18);
        
        right1.setLeftChild(right1_left);
        right1.setRightChild(new Node(35));

        BinaryTree tree = new BinaryTree(root);

        return tree;

    }

    @Test
    private void Test_Tree_Creation() {
        BinaryTree tree = GetBinaryTree();

        assertEquals(7, tree.root.getValue());
        assertEquals(6, tree.root.getLeftChild().getValue());
        assertEquals(8, tree.root.getRightChild().getValue());
    }

    @Test
    public void Test_Search_Root_Node() {
        BinaryTree tree = GetBinaryTree();

        Node resultNode = tree.search(8);
        assertEquals(8, resultNode.getValue());
    }

    @Test
    public void Test_Search_Left_Node() {
        BinaryTree tree = GetBinaryTree();

        Node resultNode = tree.search(6);
        assertEquals(6, resultNode.getValue());
    }

    @Test
    public void Test_Search_Right_Node() {
        BinaryTree tree = GetBinaryTree();

        Node resultNode = tree.search(7);
        assertEquals(7, resultNode.getValue());
    }

}
