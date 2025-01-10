package com.myothet.dsa.util;

import java.util.Random;

public class Util {

    public boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] createRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        
        int bound = 1000;

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(bound);
        }

        return arr;
    }

    public String arrayToString(int[] array) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < array.length; i++) {
            buffer.append(array[i]);
            // Optionally, add a separator (e.g., comma) between elements
            if (i < array.length - 1) {
                buffer.append(", ");
            }
        }
        String result = buffer.toString();
        
        return result;

    }

}
