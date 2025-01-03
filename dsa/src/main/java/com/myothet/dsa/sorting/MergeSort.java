package com.myothet.dsa.sorting;

import com.myothet.dsa.util.Util;

public class MergeSort {
    
    Util util = new Util();

    // 1. split
    // 2. merge 
    // arr length > 1 -> split
    int[] merge(int[] arr1, int[] arr2) {

        int result[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;

        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            // equal case
            if (arr1[i] == arr2[j]) {
                result[k++] = arr1[i];
                result[k++] = arr2[j];
            } // less than case 
            else if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }

        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];

        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public int[] sort(int[] input) {
        
        System.out.println("input: " + util.arrayToString(input));

        if (input.length > 1) {

//            [1,2,3]
//            [1,2]
//            [3]
            int middle = input.length / 2;

            // split 
//            [0, middle], [middle+1, length]
            int arr1Size = middle;
            int arr2Size = input.length - middle;

            // copy arr1
            int[] arr1 = new int[arr1Size];
            int k = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = input[k++];
            }

            // copy arr2
            int[] arr2 = new int[arr2Size];
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = input[k++];
            }
            
            arr1 = this.sort(arr1);
            arr2 = this.sort(arr2);
            
            System.out.println("arr1: " + util.arrayToString(arr1));
            System.out.println("arr2: " + util.arrayToString(arr2));

            // merge 
            int result[] = this.merge(arr1, arr2);
            return result;
        } else // single item
        {
            return new int[input[0]];
        }

    }

}
