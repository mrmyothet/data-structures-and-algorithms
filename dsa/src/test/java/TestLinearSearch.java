/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.myothet.dsa.LinearSearch;

/**
 *
 * @author macos
 */
public class TestLinearSearch {
    
    LinearSearch lsAlgo = new LinearSearch();
    int[]input = {1,2,3,4,10, -1};
        
    @Test
    public void testSearch()
    {
        int index = lsAlgo.search(input, 1);
        assertEquals(0,index);
    }
    @Test
    public void testUnhappyCase()
    {   
        int index = lsAlgo.search(input, 120);
        assertEquals(-1,index);
    }
    @Test
    public void testEdgeCase()
    {   
        int index = lsAlgo.search(input, -1);
        assertEquals(5,index);
    }
    
}
