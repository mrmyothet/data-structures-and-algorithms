package com.myothet.dsa.graph;

import java.util.Iterator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
public class AdjancencyListGraphTest {

    @Test
    public void test_GraphEdge_Exist() {
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

    @Test
    public void test_AdjacentVertices() {
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
        
        graph.addEdge("C", "F");

        graph.addEdge("D", "E"); // cycle case

        List<String> adjacentVertices = graph.getAdjacentVertices("A");
        Iterator<String> iterator = adjacentVertices.iterator();
        assertEquals("B", iterator.next());
        assertEquals("C", iterator.next());
        assertFalse(iterator.hasNext());

        adjacentVertices = graph.getAdjacentVertices("B");
        iterator = adjacentVertices.iterator();
        assertEquals("A", iterator.next());
        assertEquals("D", iterator.next());
        assertEquals("E", iterator.next());
        assertFalse(iterator.hasNext());

    }

    /**
     *
     * A - B
     * A - C
     * B - D
     * B - E
     * C - F
     *
     */
    @Test
    public void test_DFS() {

        /**
         * A-B-D-E-C-F
         */
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
        
        graph.addEdge("C", "F");

        graph.addEdge("D", "E"); // cycle case

        /**
         *
         * stack []
         *
         * pop from stack [C, B] A
         *
         * A,B [C,E,D]
         *
         * A,B,D
         *
         * A,B,D,E
         *
         * [F] A,B,D,E,C,F
         *
         * stack - push reverse order
         */
        List<String> dfsVertices = graph.DepthFirstSearch();
        Iterator<String> iterator = dfsVertices.iterator();

        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertEquals("D", iterator.next());
        assertEquals("E", iterator.next());
        assertEquals("C", iterator.next());
        assertEquals("F", iterator.next());
    }

}
