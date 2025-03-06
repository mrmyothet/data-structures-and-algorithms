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
        heapify();
    }

    public void delete(Integer item) {
        int indexToDelete = this.data.indexOf(item);

        if (indexToDelete != -1) {

            if (isLeaf(indexToDelete)) {

                System.out.println("Delete Leaf");
                this.data.remove(indexToDelete);
            } else {
                System.out.println("Not Leaf");
            }
        }
    }

    public boolean isLeaf(int nodeIndex) {

        int n = this.data.size();
        int internalNode = n / 2 - 1;

        return nodeIndex > internalNode;

//        int leftIndex = nodeIndex*2 + 1;
//        int rightIndex = nodeIndex*2 + 2;
//        Integer leftChild = null;
//        Integer rightChild = null;
//        
//        if(leftIndex < data.size())
//        {
//            leftChild = data.get(leftIndex);
//        }
//        
//        if(rightIndex < data.size())
//        {
//            rightChild = data.get(rightIndex);
//        }
//        
//        return leftChild == null && rightChild == null;
    }

    void heapify() {
        int n = this.data.size();
        int currentIndex = n / 2 - 1;

        while (currentIndex >= 0) {

            Integer parent = this.data.get(currentIndex);

            int largestIndex = currentIndex;

            int leftIndex = currentIndex * 2 + 1;
            int rightIndex = currentIndex * 2 + 2;

            Integer leftChild = null;
            Integer rightChild = null;

            if (leftIndex < data.size()) {
                leftChild = data.get(leftIndex);
                if (leftChild > parent) {
                    largestIndex = leftIndex;
                }
            }

            if (rightIndex < data.size()) {
                rightChild = data.get(rightIndex);
                if (rightChild < parent) {
                    largestIndex = rightIndex;
                }
            }

            currentIndex--;
        }
    }
}
