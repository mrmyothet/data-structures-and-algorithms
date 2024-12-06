/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macos
 */
import com.myothet.dsa.BinarySearchAlgorithm;
import com.myothet.dsa.searching.SearchAlgorithm;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {
    
    SearchAlgorithm algo = new BinarySearchAlgorithm();
    
    int[] input = {1,4,6,13,21,50};
    
    @ParameterizedTest
    @CsvSource(value = {
        "13, 3", 
        "1, 0", 
        "21, 4", 
        "50, 5",
        "100, -1",
        "5, -1", 
        "0, -1"
    })
    public void TestSearchWithParameterize(int item, int expected)
    {
        System.out.println("Item : " + item + "    Expected : " + expected);
        
        int index = algo.search(input, item);
        assertEquals(expected, index);
    }
}
