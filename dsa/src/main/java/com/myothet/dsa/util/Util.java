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
        
        for(int i=0; i<size; i++)
        {
            arr[i] = random.nextInt();
        }
        
        return arr;
    }

}
