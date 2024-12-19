
package com.myothet.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DelimiterTest {
    Delimiter delimiter = new Delimiter();
    
    @ParameterizedTest
    @CsvSource(value = {
        "'', true", 
        "c[d], true", 
        "a{bd}e,true",
        "c[d, faluse", 
        "a[b{c}d]e}, false", 
        "a{b(c), false"
    })
    public void testWithParameters(String item, boolean expected)
    {
        boolean valid = delimiter.isValid(item);
        assertEquals(valid, expected);
    }

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
        assertFalse(delimiter.isValid("a{b(c)"));
    }
}
