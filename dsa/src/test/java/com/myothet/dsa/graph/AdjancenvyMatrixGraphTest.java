
package com.myothet.dsa.graph;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * 
 * A - B
 * A - C
 * B - D
 * B - E
 * C - D
 * C - F
 * 
 */
public class AdjancenvyMatrixGraphTest {
    
    @Test
    public void test_GraphEdge_Exist()
    {
        GraphAMatrix graph = new GraphAMatrix();
        
        // vertices 
        graph.addVertice("A");
        graph.addVertice("B");
        graph.addVertice("C");
        graph.addVertice("D");
        graph.addVertice("E");
        graph.addVertice("F");
        
        graph.buildMatrix();
        
        // edges 
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");
        
        graph.addEdge("C", "D");
        graph.addEdge("C", "E");
        
        assertTrue(graph.existEdge("A", "B"));
        assertTrue(graph.existEdge("B", "A"));
    }
    
}
