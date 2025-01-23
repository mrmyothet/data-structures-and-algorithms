package com.myothet.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class InOrderTraversalImperative implements BinaryTreeTraversal {

    BinaryTree tree;

    ArrayList<Node> list;

    public InOrderTraversalImperative(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator();
    }

    public void TraverseInOrder() {
        Node current = this.tree.root;
        this.traverseInOrder(current);
//        this.traverseInOrderShort(current);
    }

    /*
    
    Draft Algorithm  - didn't work 
    
    not leaf 
      while (current != null)
          if not leaf
            push to stack
        
        if (left) 
            current = current.left 
        else
            print node
            if (stack not empty)
                current = stack.pop(); // root 
                print (root)
                if (right)
                    current = right;
            else 
                break;
           
     */
 /*
    
    Alternative Algorithm 
    
    if there is a left child push to stack. 
    
    // Left 
    while( there is left child )
    {
        push (current)
        current = current.left
    }
    
    print(currentNode)
    
    // Root 
    if (stack is not empty)
    {
        pop from stack 
        print root 
    
        while(there is right child)
        {
            current = current.right
        }
    }
    
    
     */
    public void traverseInOrder(Node node) {

        // Left - Root - Right
        Node current = node;

        Stack<Node> stack = new Stack<Node>();

        while (current != null) {

            while (current.leftChild != null) {
                stack.push(current);
//                System.out.println("Push to stack " + current.value);
                current = current.leftChild;
            }

            // left 
            System.out.println("Node " + current.value);
            list.add(current);

            if (current.rightChild != null) {
                
                // Node have no left child but it have right child 
                // so, it is root
                
                current = current.rightChild;
                
            } else if (!stack.isEmpty()) {
                // Root
                current = stack.pop();
//                System.out.println("Pop from stack " + current.value);

                System.out.println("Node " + current.value);
                list.add(current);

                // Right 
                if (current.rightChild != null) {
                    current = current.rightChild;
                }

            } else {
                break;
            }
        }

    }

    public void traverseInOrderShort(Node node) {

        // Left - Root - Right
        Node current = node;

        Stack<Node> stack = new Stack<Node>();

        while (current != null || !stack.isEmpty()) {

            if (current != null) {
                stack.push(current);
                current = current.leftChild;
            } else {
                current = stack.pop();
                // Process the node (e.g., print its value)
                System.out.print(current.value + " ");
                current = current.rightChild;
            }
        }
    }

    class TreeIterator implements Iterator<Node> {

        int currentIndex = 0;

        TreeIterator() {
            list = new ArrayList<Node>();
            TraverseInOrder();
        }

        @Override
        public boolean hasNext() {
            return currentIndex <= list.size() - 1;
        }

        @Override
        public Node next() {
            return list.get(currentIndex++);
        }

    }

}
