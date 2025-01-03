package com.myothet.dsa.sorting;

import org.junit.jupiter.api.Test;
import com.myothet.dsa.util.Util;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTest {

    Util util = new Util();

    MergeSort algo = new MergeSort();

//    @Test
    public void Test_Merge() {

        int[] arr1 = {1, 4};
        int[] arr2 = {2, 5};
        int result[] = algo.merge(arr1, arr2);
        // [1,2,4,5]
        System.out.println(Arrays.toString(result));
        assertTrue(util.isArraySorted(result));

        assertEquals(4, result.length);
    }

//    @Test
    public void Test_Merge_EqualCase() {

        int[] arr1 = {1, 4};
        int[] arr2 = {1, 2, 5};
        int result[] = algo.merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
        assertTrue(util.isArraySorted(result));

    }

//    @Test
    public void Test_Merge_UnEqualSize() {
        int[] arr1 = {1, 4, 7, 9};
        int[] arr2 = {1, 2, 5};
        int result[] = algo.merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
        assertTrue(util.isArraySorted(result));

    }

//    @Test
    public void Test_Merge_UnEqualSize_2() {

        int[] arr1 = {1, 4, 7, 9};
        int[] arr2 = {1, 2, 5, 6, 10, 12, 20};
        int result[] = algo.merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
        assertTrue(util.isArraySorted(result));

    }

    @Test
    public void Test_Sort_BaseCase() {
        int[] input = {3, 1};
        int[] result = algo.sort(input);
        assertTrue(util.isArraySorted(result));
    }

//    @Test
    public void Test_Sort_ManyItem() {
        int[] input = {3, 1, 4};
        int[] result = algo.sort(input);
        assertTrue(util.isArraySorted(result));
    }

//    @Test
    public void Test_Sort_RandomData() {
        int[] input = util.createRandomArray(5);
        System.out.println(util.arrayToString(input));

        int[] result = algo.sort(input);
        System.out.println(util.arrayToString(result));

        assertTrue(util.isArraySorted(result));
    }
}
