package com.myothet.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAList extends Graph {

    List<List<String>> adjacencyList = new ArrayList<List<String>>();

    @Override
    public void build() {
        for (String vertice : this.vertices) {
            List<String> adjList = new ArrayList<>();
            this.adjacencyList.add(adjList);
        }
    }

    @Override
    public void addEdge(String from, String to) {
        int fromIndex = this.vertices.indexOf(from);
        List<String> adjList = this.adjacencyList.get(fromIndex);
        adjList.add(to);

        int toIndex = this.vertices.indexOf(to);
        adjList = this.adjacencyList.get(toIndex);
        adjList.add(from);

    }

    @Override
    public boolean existEdge(String from, String to) {
        int fromIndex = this.vertices.indexOf(from);
        List<String> adjList = this.adjacencyList.get(fromIndex);
        return adjList.contains(to);
    }

    @Override
    public List<String> getAdjacentVertex(String from) {
        int fromIndex = this.vertices.indexOf(from);
        List<String> adjList = this.adjacencyList.get(fromIndex);
        return adjList;
    }

}
