package com.myothet.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapUtil {

    public static boolean isMaxHeap(MaxHeap heap) {
        List<Integer> data = heap.getData();

        int currentIndex = 0;
        Integer current = data.get(currentIndex);

        return isMaxHeap(data, currentIndex);

//        while (current != null) {
//            int leftIndex = currentIndex * (2 + 1);
//            int rightIndex = currentIndex * (2 + 2);
//
//            if (leftIndex < data.size()) {
//                Integer leftChild = data.get(leftIndex);
//
//            }
//
//            if (rightIndex < data.size()) {
//                Integer rightChild = data.get(rightIndex);
//            }
//        }
    }

    public static boolean isMaxHeap(List<Integer> data, int currentIndex) {
        Integer root = data.get(currentIndex);

        int leftIndex = currentIndex * 2 + 1;
        int rightIndex = currentIndex * 2 + 2;

        Integer leftChild = null;
        Integer rightChild = null;

        boolean isMax = true;

        if (leftIndex < data.size()) {
            leftChild = data.get(leftIndex);
            if (root < leftChild) {
                isMax = false;
            }
            isMax = isMax && isMaxHeap(data, rightIndex);
        }

        if (rightIndex < data.size()) {
            rightChild = data.get(rightIndex);
            if (root < rightChild) {
                isMax = false;
            }

            isMax = isMax && isMaxHeap(data, rightIndex);
        }

        return isMax;
    }
}
