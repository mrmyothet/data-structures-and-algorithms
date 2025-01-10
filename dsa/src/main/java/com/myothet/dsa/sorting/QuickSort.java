package com.myothet.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

    int findPivot_1(int[] arr) {
        int tempPivotIndex = 0;

        int left = tempPivotIndex + 1;
        int right = arr.length - 1;

        while (left <= right) {

            while (left <= right && arr[left] < arr[tempPivotIndex]) {
                left++;
            }

            while (left <= right && arr[right] > arr[tempPivotIndex]) {
                right--;
            }

            System.out.println("left " + left + " right " + right);

            if (left < right) {

                // exchange left, right 
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            System.out.println(Arrays.toString(arr));
        }

        // left == right
        System.out.println("tempPivotIndex:" + tempPivotIndex + " left: " + left + " right: " + right);

        if (arr[tempPivotIndex] > arr[right]) {
            int temp = arr[right];
            arr[right] = arr[tempPivotIndex];
            arr[tempPivotIndex] = temp;

            tempPivotIndex = right;
        }

        System.out.println(Arrays.toString(arr));

        return tempPivotIndex;
    }

    public int findPivot(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;

        for (int j = start; j < end - 1; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;

        return pivotIndex;
    }

    public void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = findPivot(arr, start, end);
        sort(arr, start, pivotIndex - 1);
        sort(arr, pivotIndex + 1, end);

    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot_1(arr);
        System.out.println("pivotIndex: " + pivotIndex);
    }

}
