package com.myothet.dsa.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GraphAMatrix extends Graph {

    int[][] matrix;

    @Override
    public void build() {

        int n = this.vertices.size();
        this.matrix = new int[n][n];
    }

    @Override
    public void addEdge(String from, String to) {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);

        this.matrix[fromIndex][toIndex] = 1;
        this.matrix[toIndex][fromIndex] = 1;
    }

    @Override
    public boolean existEdge(String from, String to) {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);

        return this.matrix[fromIndex][toIndex] != 0;
    }

    @Override
    public List<String> getAdjacentVertex(String from) {
        List<String> vertexs = new ArrayList<>();

        for (String vertex : this.vertices) {
            if (!from.equals(vertex)) {
                if (this.existEdge(from, vertex)) {
                    vertexs.add(vertex);
                }
            }
        }
        return vertexs;
    }
}
