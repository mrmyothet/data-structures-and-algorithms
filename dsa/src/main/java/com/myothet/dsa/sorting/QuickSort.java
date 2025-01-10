package com.myothet.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

    int findPivot_before(int[] arr) {
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
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        if (arr[i] < pivot) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }

        return i;
    }

    public void sort(int[] arr, int start, int end) {

        if (start < end) {
            int pivotIndex = findPivot(arr, start, end);

            System.out.println(Arrays.toString(arr));
            System.out.println("PivotIndex " + pivotIndex + " start: " + start + " end: " + end);
            System.out.println("Pivot:" + arr[pivotIndex]);
            System.out.println("");

            sort(arr, start, pivotIndex - 1);
            sort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot_before(arr);
        System.out.println("pivotIndex: " + pivotIndex);
    }

}
