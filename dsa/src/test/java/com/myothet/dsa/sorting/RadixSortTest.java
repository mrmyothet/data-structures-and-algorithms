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

    @Test
    public void testSort() {
        int[] arr = {4, 7, 5, 6, 3, 1};

        algo.sort(arr);
        assertTrue(util.isArraySorted(arr));
    }

    @Test
    public void test_getDigitAtIndex() {
        assertEquals(3, algo.getDigitAtIndex(3, 0));
        assertEquals(0, algo.getDigitAtIndex(3, 1));
        assertEquals(0, algo.getDigitAtIndex(3, 2));

        assertEquals(0, algo.getDigitAtIndex(1, 1));

        assertEquals(1, algo.getDigitAtIndex(13, 1));
        assertEquals(2, algo.getDigitAtIndex(23, 1));
        assertEquals(2, algo.getDigitAtIndex(123, 1));

        assertEquals(3, algo.getDigitAtIndex(323, 2));

    }

}
