package com.myothet.dsa.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GraphAMatrix {

    List<String> vertices = new ArrayList<>();

    int rows = 100;
    int cols = 100;
    int[][] matrix = new int[rows][cols];

    public void addVertice(String vertex) {
        this.vertices.add(vertex);
    }

    public void buildMatrix() {
        int n = this.vertices.size();
        this.matrix = new int[n][n];
    }

    public void addEdge(String from, String to) {

        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);

        this.matrix[fromIndex][toIndex] = 1;
        this.matrix[toIndex][fromIndex] = 1;

    }

    public boolean existEdge(String from, String to) {

        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);

        return this.matrix[fromIndex][toIndex] != 0;
    }

    List<String> getAdjacentVertices(String from) {
        List<String> vertices = new ArrayList<String>();

        for (String vertex : this.vertices) {
            if (!from.equals(vertex)) {
                if (this.existEdge(from, vertex)) {
                    vertices.add(vertex);
                }
            }
        }

        return vertices;
    }

    public List<String> DepthFirstSearch() {
        List<String> visited = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();

        String root = this.vertices.get(0);
        stack.push(root);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();

            if (!visited.contains(vertex)) {
                visited.add(vertex);
            }

            List<String> adjacentVertices = this.getAdjacentVertices(vertex);

//            Collections.reverse(adjacentVertices);
            for (int i = adjacentVertices.size() - 1; i >= 0; i--) {
                String adjVertex = adjacentVertices.get(i);
                if (!visited.contains(adjVertex)) {
                    stack.push(adjVertex);
                }

            }
        }

        return visited;
    }
}
