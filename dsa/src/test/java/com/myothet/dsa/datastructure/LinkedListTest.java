
package com.myothet.dsa.datastructure;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    
    @Test
    public void TestInsertFirst()
    {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addFirst(first);
        
        Node second = new Node(20);
        list.addFirst(second);
        
        Iterator iterator = list.iterator();
        assertEquals(second, iterator.next());
        assertEquals(first, iterator.next());
    }
    
    @Test
    public void TestInsertFirstMany()
    {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        list.addFirst(first);
        
        Node second = new Node(20);
        list.addFirst(second);
        
        Node third = new Node(30);
        list.addFirst(third);
        
        Iterator iterator = list.iterator();
        
        assertEquals(third, iterator.next());
        assertEquals(second, iterator.next());
        assertEquals(first, iterator.next());
    }
    
    @Test
    public void TestInsertAndIterate()
    {
        LinkedList list = new LinkedList();
        
        for(int i=0; i<10; i++)
        {
            list.addFirst(new Node(i));
        }
        
        int i =9;
        Iterator iterator = list.iterator();
        
        while(iterator.hasNext())
        {
            Node node = (Node)iterator.next();
            assertEquals(i--, node.getValue());
        }
    }
    
}
