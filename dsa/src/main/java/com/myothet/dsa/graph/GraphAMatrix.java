package com.myothet.dsa.graph;

import java.util.ArrayList;
import java.util.List;

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
}
