package com.myothet.dsa.sorting;

import java.util.ArrayList;

public class RadixSort {

    /* Lease Significant Digit
    
    int[] arr = {170, 45, 75, 90, 2, 802, 2, 66};

    0
    [170, 90], [2,802,2], [45], [66]
    
    1
    [2, 802, 2], [45], [66]
    
    2
    [2,2,45,66,]
    
     */
    public int digitLength(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return String.valueOf(max).length();
    }

    public int[] sort(int[] arr) {
        int length = this.digitLength(arr);

        int MAX_DIGIT = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            // bucket 10
            // Initialize

            var items = new ArrayList<ArrayList<Integer>>();
            for (int j = 0; j < MAX_DIGIT; j++) {

                var list = new ArrayList<Integer>();
                items.add(list);
            }

            // collect digit into bucket according to position
            for (int k = 0; k < arr.length; k++) {
                int index = this.getDigitAtIndex(arr[k], i);
                items.get(index).add(arr[k]);
            }

            // collect bucket into single ArrayList
            ArrayList<Integer> allItems = new ArrayList<Integer>();
            for (int k = 0; k < MAX_DIGIT; k++) {
//                allItems.addAll(list);
            }

            // copied back to array
            for (int j = 0; j < MAX_DIGIT; j++) {

            }

        }

        return arr;

    }

    public int getDigitAtIndex(int num, int position) {
        String str = String.valueOf(num);

        if (position <= str.length() - 1) {

            int index = str.length() - (position + 1);

            char ch = str.charAt(index);
            return Integer.valueOf(ch + "");
        } else {
            return 0;
        }
    }
}
