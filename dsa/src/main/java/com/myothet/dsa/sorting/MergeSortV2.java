package com.myothet.dsa.sorting;

public class MergeSortV2 {

    public void merge(int[] input, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;

        int len = right - left + 1;
        int result[] = new int[len];

        while (i <= middle && j <= right) {
            // equal case 
            if (input[i] == input[j]) {
                result[k++] = input[i++];
            } // less than case
            else if (input[i] < input[j]) {
                result[k++] = input[i++];
            } // greater than 
            else {
                result[k++] = input[j++];
            }
        }

        while (i <= middle) {
            result[k++] = input[i++];
        }

        while (j <= right) {
            result[k++] = input[j++];
        }

//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(input));
        System.arraycopy(result, 0, input, left, len);
    }

    public void MergeSort(int[] input, int left, int middle, int right) {
        // split, sort, merge 

        // Base Case 
        if (left < right) {
            // do again

            // [left, middle]
            // [middle+1, right]
            int firstMiddle = (left + right) / 2;
            this.MergeSort(input, left, firstMiddle, middle);

            int secondMiddle = (middle + 1 + right) / 2;
            this.MergeSort(input, middle + 1, secondMiddle, right);

            this.merge(input, left, middle, right);
        } else {
            // Single Item, already sorted
//            System.out.println("Single item sorted : " + input[left]);
            return;
        }
    }

    public void sort(int[] input) {
        int left = 0;
        int right = input.length - 1;
        int middle = (left + right) / 2;
        this.MergeSort(input, left, middle, right);
    }
}
