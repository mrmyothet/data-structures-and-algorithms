package com.myothet.dsa.sorting;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PartitionTest {

//    @Test
    public void TestPartitionBoundaryCase() {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot(arr);

        Assert_Pivot(arr, pivotIndex);

    }

    @Test
    public void TestPartition_BaseCase() {

//        int[] arr = {5, 1, 7, 2, 4};
        int[] arr = {4, 7, 5, 6, 3, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot(arr);

        Assert_Pivot(arr, pivotIndex);

    }

    private void Assert_Pivot(int[] arr, int pivotIndex) {
        int pivot = arr[pivotIndex];

        for (int i = 0; i <= pivotIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }

        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= pivot);
        }
    }

}
