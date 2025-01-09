package com.myothet.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

    int findPivot(int[] arr) {
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

    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 7, 5, 6, 4, 1};

        QuickSort algo = new QuickSort();

        int pivotIndex = algo.findPivot(arr);
        System.out.println("pivotIndex: " + pivotIndex);
    }

}
