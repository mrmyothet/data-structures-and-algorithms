package com.myothet.dsa.heap;

import com.myothet.dsa.util.Util;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HeapTest {

    MaxHeap heap = new MaxHeap();

    @Test
    public void test_IsMaxHeap_BaseCase() {
        Integer[] data = {10};

        heap.setData(Arrays.asList(data));

        assertTrue(HeapUtil.isMaxHeap(heap));
    }

    @Test
    public void test_Heapify_BaseCase() {
        heap.insert(9);
        heap.insert(10);
        heap.insert(15);

        assertTrue(HeapUtil.isMaxHeap(heap));
    }

    @Test
    public void test_Heapify_Randam() {
        Util util = new Util();
        int arr[] = util.createRandomArray(15);

        for (int item : arr) {
            heap.insert(item);
        }

        assertTrue(HeapUtil.isMaxHeap(heap));
    }

    @Test
    public void test_Delete_Leaf() {
        heap.insert(10);
        heap.insert(9);
        heap.insert(8);

        heap.delete(8);

        assertTrue(HeapUtil.isMaxHeap(heap));

    }
}
