/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.myothet.dsa.Capital;

/**
 *
 * @author macos
 */
public class TestCapital {
    @Test
    public void testEmpty()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("");
        
        assertEquals("",output);
        
    }
    @Test
    public void TestNull()
    {
        Capital cap = new Capital();
        String output = cap.toCapital(null);
        
        assertEquals("",output);
        
    }
    @Test
    public void TestSingleWord()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("apple");
        
        assertEquals("Apple",output);
        
        output = cap.toCapital("Apple");
        assertEquals("Apple",output);
        
    }
    @Test
    public void TestMulipleWord()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("apple orange");
        
        assertEquals("Apple Orange",output);
        
        output = cap.toCapital("Apple Orange");
        assertEquals("Apple Orange",output);
        
    }
}
