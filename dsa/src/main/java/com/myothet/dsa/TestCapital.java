/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.myothet.dsa;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macos
 */
public class TestCapital {
    
    @Test
    public void TestEmpty()
    {
    
    }
    
    @Test
    public void testNull()
    {
    
    }
    
    
    @Test
    public void testSingleWord()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("apple");
    }
    
    @Test
    public void testMultipleWord()
    {
    
    }
}
