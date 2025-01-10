package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PartitionTest2 {

    Util util = new Util();

    private void Assert_Pivot(int[] arr, int pivotIndex) {
        int pivot = arr[pivotIndex];

        for (int i = 0; i <= pivotIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }

        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= pivot);
        }
    }

    @Test
    public void TestPartitionBoundaryCase() {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot(arr, 0, arr.length - 1);
        System.out.println("pivotIndex: " + pivotIndex);

        Assert_Pivot(arr, pivotIndex);

    }

    @Test
    public void TestPartition_BaseCase() {

        int[] arr = {4, 7, 5, 6, 3, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot(arr, 0, arr.length - 1);
        System.out.println("pivotIndex: " + pivotIndex);

        Assert_Pivot(arr, pivotIndex);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void testPartition_Random() {

        int[] arr = util.createRandomArray(20);

        QuickSort algo = new QuickSort();
        
        int pivotIndex = algo.findPivot(arr, 0, arr.length - 1);
        System.out.println("pivotIndex: " + pivotIndex);

        Assert_Pivot(arr, pivotIndex);
    }

}
