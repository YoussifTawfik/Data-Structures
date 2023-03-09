package com.data.structure.graph;

public class Main {

    public static void main(String[] args) {
        Graph myGraph=new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.printGraph();

        myGraph.removeEdge("A", "B");
        myGraph.printGraph();
    }
}
