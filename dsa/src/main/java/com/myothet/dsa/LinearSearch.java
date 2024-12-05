/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myothet.dsa;

/**
 *
 * @author macos
 */
public class LinearSearch {
    
    public int search(int[] array, int item)
    {
        for (int i=0; i<10; i++)
        {
            if(array[i] == item)
            {
                return item;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
    int[] input = {1,2,3,4,10};
    
    LinearSearch ls = new LinearSearch();
    System.out.println("Search " + ls.search(input, 1));
    }
    
}
