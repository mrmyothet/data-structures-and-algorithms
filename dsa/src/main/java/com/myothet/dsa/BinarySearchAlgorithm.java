/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myothet.dsa;

import com.myothet.dsa.searching.SearchAlgorithm;

/**
 *
 * @author macos
 */
public class BinarySearchAlgorithm implements SearchAlgorithm{
    public int search(int[] arr, int item)
    {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end)
        {
            int middle = (start + end) / 2;
            
            if (arr[middle] == item)
            {
                // found 
                return middle;
            }
            else if (arr[middle] > item)
            {
                end = middle - 1;
            }
            else if (arr[middle] < item)
            {
                start = middle + 1;
            }
        }
        return -1;
    }
}
