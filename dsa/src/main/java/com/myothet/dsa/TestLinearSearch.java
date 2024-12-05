/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myothet.dsa;

import org.junit.jupiter.api.Test;

/**
 *
 * @author macos
 */
public class TestLinearSearch {
    
    @Test
    public void testSearch()
    {
        LinearSearch lsAlgo = new LinearSearch();
        
        int[] input = {1,2,3,4,10};
        
        int index = lsAlgo.search(input, 1);
        
       
    }
    
    public void testUnhappyCase()
    {
        LinearSearch ls = new LinearSearch();
        int[] input = {1,2,3,4,10};
        
        int index = ls.search(input, 5);
        
    }
    
}
