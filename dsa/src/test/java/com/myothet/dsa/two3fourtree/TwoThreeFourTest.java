package com.myothet.dsa.two3fourtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoThreeFourTest {

    @Test
    public void test_Insert_Simplest() {
        TwoThreeFourTree tree = new TwoThreeFourTree();
        
        tree.insert(100);
        
        Node root = tree.getRoot();
        assertEquals(100, root.keys[0]);

    }
}
