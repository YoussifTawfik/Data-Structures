package com.data.structure.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
* Space Complexity: O( V + E) -----> Vertices + Edges
* Time Complexity:
* Insertion: O(1)
* Deletion: O ( V + E)
* */
public class Graph<K> {

    private Map<K, ArrayList<K>> adjList = new HashMap<>();

    public boolean addVertex(K vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean removeVertex(K vertex) {
        if (adjList.get(vertex) == null) return false;
        for (K otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    public boolean addEdge(K vertex1, K vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(K vertex1, K vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public void printGraph() {
        System.out.println(adjList);
    }
}


