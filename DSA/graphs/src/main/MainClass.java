package main;

import graphclass.Graph;

public class MainClass {

	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");

		graph.addEdge("A", "B");
		graph.addEdge("B", "C");
		
		graph.removeEdge("A", "B");

		graph.removeVertex("C");
		graph.printGraph();
	}
}
