
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
    
}
