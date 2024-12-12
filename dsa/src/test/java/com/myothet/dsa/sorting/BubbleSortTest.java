package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    Util util = new Util();
    SortingAlgorithm bubbleSort = new BubbleSort();

    @Test
    public void testBubbleSort() {

        int[] arr = {50, 20, 11, 3, 45, 2};
        bubbleSort.sort(arr);

        assertTrue(util.isArraySorted(arr));
    }

    @Test
    public void testSingleElement() {

        int[] arr = {3};

        bubbleSort.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }

    @Test
    public void testDoubleElement() {

        int[] arr = {4, 3, 2, 2, 1};

        bubbleSort.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }

    @Test
    public void testBubbleSortRandom() {

        int[] arr = util.createRandomArray(20);

        bubbleSort.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }
}
