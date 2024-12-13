
package com.myothet.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DelimiterTest {
    Delimiter delimiter = new Delimiter();

    @Test
    public void testEmpty()
    {
        
        boolean valid = delimiter.isValid("c[d]");
        
        assertTrue(valid);
    }
    
    @Test
    public void testBracket()
    {
        boolean valid = delimiter.isValid("c[d]");
        assertTrue(valid);
        
    }
    
    @Test
    public void testBracketNegative()
    {
        assertFalse(delimiter.isValid("c[d"));
    }
    
    @Test
    public void testMultipleDelimiter()
    {
        assertTrue(delimiter.isValid("a{bd}e"));
    }
    
    @Test
    public void testMultipleDelimiterNegative()
    {
        assertFalse(delimiter.isValid("a{bd}e"));
    }
}
