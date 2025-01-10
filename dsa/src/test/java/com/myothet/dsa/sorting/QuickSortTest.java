package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    Util util = new Util();

    @Test
    public void Test_QuickSort_BaseCase() {

        int[] arr = {97, 106, 119, 111, 250};

        QuickSort algo = new QuickSort();
        algo.sort(arr, 0, arr.length - 1);

        assertTrue(util.isArraySorted(arr));
        System.out.println(Arrays.toString(arr));

    }

//    @Test
    public void Test_QuickSort_Random() {

        int[] arr = util.createRandomArray(10);
        System.out.println("Before: " + Arrays.toString(arr));

        QuickSort algo = new QuickSort();
        algo.sort(arr, 0, arr.length - 1);

        System.out.println("After: " + Arrays.toString(arr));
        assertTrue(util.isArraySorted(arr));
    }

}
