package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    Util util = new Util();

    @Test
    public void testPartition_Random() {

        int[] arr = util.createRandomArray(20);
        System.out.println(Arrays.toString(arr));

        QuickSort algo = new QuickSort();
        algo.sort(arr, 0, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
        util.isArraySorted(arr);
    }

}
