package com.myothet.dsa.sorting;

import com.myothet.dsa.BinarySearchAlgorithm;
import com.myothet.dsa.recursion.RecursiveBinarySearchAlgorithm;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {

    RecursiveBinarySearchAlgorithm algo = new RecursiveBinarySearchAlgorithm();

    int[] input = {1, 4, 6, 13, 21, 50};

    @ParameterizedTest
    @CsvSource(value = {
        "11, -1",
        "6, 2",
        "4, 1",
        "13, 3",
        "1, 0",
        "21, 4",
        "50, 5",
        "100, -1",
        "5, -1",
        "0, -1"
    })
    public void TestSearchWithParameterize(int item, int expected) {
        System.out.println("Item : " + item + "    Expected : " + expected);

        int index = algo.search(input, item, 0, input.length-1);
        assertEquals(expected, index);
    }
}
