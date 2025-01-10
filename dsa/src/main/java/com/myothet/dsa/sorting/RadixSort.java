package com.myothet.dsa.sorting;

public class RadixSort {

    /* Lease Significant Digit
    
    int[] arr = {170, 45, 75, 90, 2, 802, 2, 66};

    0
    [170, 90], [2,802,2], [45], [66]
    
    1
    [2, 802, 2], [45], [66]
    
    2
    [2,2,45,66,]
    
     */
    
    public int digitLength(int[] arr)
    {
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max= arr[i];
            }
        }
                
        return max; 
    }
    
    public void sort(int[] arr)
    {
        
    }
}
