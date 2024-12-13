package com.myothet.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StackTest {
// Arrange 
    // Stack
// Act
    // push(10)
//Assert    
    // behavior

    Stack stack = new Stack(10);

    @Test
    public void testPush() {

        int size = stack.size();
        stack.push(100);

        assertEquals(size + 1, stack.size());

        int element = stack.peek();
        assertEquals(100, element);
    }

    @Test
    public void testPushElement2() {

        int size = stack.size();
        stack.push(200);

        assertEquals(size + 1, stack.size());

        int element = stack.peek();
        assertEquals(200, element);
    }

    public void testPushMultipleElement() {
        stack.push(200);
        stack.push(300);
        assertEquals(2, stack.size());
        
        int element = stack.peek();
        assertEquals(300, element);
    }
    
    @Test
    public void testPop()
    {
        stack.push(100);
        
        int size=stack.size();
        int element = stack.pop();
        
        assertEquals(100, element);
        assertEquals(size-1, stack.size());
        
    }
    
    @Test
    public void testpopTwo()
    {
        stack.push(100);
        stack.push(200);
        
        int size = stack.size();
        int element = stack.pop();
        
        assertEquals(element, 100);
        
        int element2 = stack.pop();
        assertEquals(element2, 200);
    }
}
