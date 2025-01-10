package com.myothet.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PartitionTest {

    @Test
    public void TestPartitionBoundaryCase() {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot_before(arr);
        System.out.println("pivotIndex: " + pivotIndex);

        Assert_Pivot(arr, pivotIndex);

    }

    @Test
    public void TestPartition_BaseCase() {

        int[] arr = {4, 7, 5, 6, 3, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot_before(arr);
        System.out.println("pivotIndex: " + pivotIndex);

        Assert_Pivot(arr, pivotIndex);

    }

    @Test
    public void TestPartition_BaseCase_2() {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 3};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot_before(arr);
        System.out.println("pivotIndex: " + pivotIndex);

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
