package com.myothet.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

    int findPivot(int[] arr) {
        int tempPivotIndex = 0;

        int left = tempPivotIndex + 1;
        int right = arr.length - 1;

        while (left < arr.length - 1 && left < right) {

            while (arr[left] < arr[tempPivotIndex] && left < arr.length - 1) {
                left++;
            }

            while (arr[right] > arr[tempPivotIndex] && left < right) {
                right--;
            }

            System.out.println("left " + left + " right " + right);

            // exchange left, right 
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
//            left++;
//            right--;

            System.out.println(Arrays.toString(arr));
        }

        // left == right
        System.out.println(arr[tempPivotIndex] + " "  + arr[left]);
        
        if (arr[tempPivotIndex] > arr[left]) {
            int temp = arr[left];
            arr[left] = arr[tempPivotIndex];
            arr[tempPivotIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));

        return tempPivotIndex;
    }

}
