package com.myothet.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    List<Integer> data = new ArrayList<>();

    public void setData(List<Integer> lst) {
        this.data = lst;
    }

    public List<Integer> getData() {
        return this.data;
    }

    public void insert(Integer item) {
        this.data.add(item);
    }

    void heapify() {
        int n = this.data.size();
        int currentIndex = n / 2 - 1;

        while (currentIndex >= 0) {
            Integer largest = this.data.get(currentIndex);

            int leftIndex = currentIndex * 2 + 1;
            int rightIndex = currentIndex * 2 + 2;

            Integer leftChild = null;
            Integer rightChild = null;
        }
    }
}
