package com.myothet.dsa.sorting;

public class ShellSort implements SortingAlgorithm {

    @Override
    public void sort(int[] arr) {

        int gap = arr.length / 2;

        while (gap > 0) {
            System.out.println("Gap " + gap);

            for (int i = gap; i < arr.length; i++) {

                System.out.println("Compare with " + i + " with " + (i + gap));

                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }

            gap = gap / 2;
        }

    }

}
