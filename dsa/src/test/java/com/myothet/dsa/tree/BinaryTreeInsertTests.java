
package com.myothet.dsa.tree;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeInsertTests {
    
    @Test
    public void test_Insert_Left_Node()
    {
        Node root = new Node(17);
        
        BinaryTree tree = new BinaryTree(root);
        
        Node insertedNode = tree.insert(15);
        
        assertEquals(root, insertedNode.getParent());
        assertEquals(insertedNode, root.getLeftChild());
    }
    
    @Test
    public void test_Insert_Right_Node()
    {
        Node root = new Node(17);
        
        BinaryTree tree = new BinaryTree(root);
        
        Node insertedNode = tree.insert(15);
        
        assertEquals(root, insertedNode.getParent());
    }
    
    @Test
    public void test_Insert_Level_2()
    {
        Node root = new Node(17);
        
        BinaryTree tree = new BinaryTree(root);
        
        Node firstChild = tree.insert(15);
        Node insertedNode = tree.insert(16);
        
        assertEquals(insertedNode, firstChild.getRightChild());
    }
    
    @Test
    public void test_Insert_Level_2_Left()
    {
        Node root = new Node(17);
        
        BinaryTree tree = new BinaryTree(root);
        
        Node firstChild = tree.insert(15);
        Node insertedNode = tree.insert(13);
        
        assertEquals(insertedNode, firstChild.getLeftChild());
    }
}
