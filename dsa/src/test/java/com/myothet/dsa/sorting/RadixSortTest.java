package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RadixSortTest {
    
    Util util = new Util();
    RadixSort algo = new RadixSort();

    @Test
    public void DigitLength_Test() {
        RadixSort sort = new RadixSort();

        int[] arr = {100, 2000, 3};

        assertEquals(4, sort.digitLength(arr));
    }
    
//    @Test
    public void testSort()
    {
        int[] arr = {4,7,5,6,3,1};
        
        algo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }

}
