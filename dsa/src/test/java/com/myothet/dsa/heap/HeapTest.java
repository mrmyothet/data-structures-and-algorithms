
package com.myothet.dsa.heap;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HeapTest {
    
    @Test
    public void test_IsMaxHeap_BaseCase()
    {
        Integer[] data = {10};
        
        MaxHeap heap = new MaxHeap();
        
        heap.setData(Arrays.asList(data));
        
        assertTrue(HeapUtil.isMaxHeap(heap));
    }
}
