package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class ShellSortTest {
    
    Util util = new Util();
    
    SortingAlgorithm shellSort = new ShellSort();

    @Test
    public void testBubbleSort() {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};
        shellSort.sort(arr);

        assertTrue(util.isArraySorted(arr));
    }
    
     @Test
    public void testShellSortRandom() {

        int[] arr = util.createRandomArray(20);

//        System.out.println(util.arrayToString(arr));
        shellSort.sort(arr);
//        System.out.println(util.arrayToString(arr));
        
        assertTrue(util.isArraySorted(arr));
    }
    
}
