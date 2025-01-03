package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MergeSortTestV2 {

    Util util = new Util();

    MergeSortV2 algo = new MergeSortV2();

//    @Test
    public void Test_BaseCase() {

//        int[] input = {1,2,10,3,4,8};
        int[] input = {1, 3, 5};

        int left = 0;
        int right = input.length - 1;
        int middle = (left + right) / 2;
        algo.merge(input, left, middle, right);

        assertTrue(util.isArraySorted(input));
    }

    @Test
    public void Test_Sort_ManyItem() {
        int[] input = {3, 1, 5};
        algo.sort(input);

//        System.out.println(Arrays.toString(input));
        assertTrue(util.isArraySorted(input));
    }

    @Test
    public void Test_Sort_RandomData() {
        int[] input = util.createRandomArray(10);
        System.out.println(util.arrayToString(input));

        algo.sort(input);
        System.out.println(util.arrayToString(input));

        assertTrue(util.isArraySorted(input));
    }
}
