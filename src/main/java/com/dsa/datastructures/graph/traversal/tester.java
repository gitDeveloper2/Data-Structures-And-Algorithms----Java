package com.dsa.datastructures.graph.traversal;

import java.util.Arrays;

import com.dsa.datastructures.graph.Vertex;

public class tester {
public static void main(String[] args) {
	Vertex<Integer> vertex0=new Vertex<Integer>(0);
	Vertex<Integer> vertex1=new Vertex<Integer>(1);
	Vertex<Integer> vertex2=new Vertex<Integer>(2);
	Vertex<Integer> vertex3=new Vertex<Integer>(3);
	Vertex<Integer> vertex4=new Vertex<Integer>(4);
	Vertex<Integer> vertex5=new Vertex<Integer>(5);
	Vertex<Integer> vertex6=new Vertex<Integer>(6);
	
	vertex0.setNeighbours(Arrays.asList(vertex1,vertex5, vertex6));
	vertex1.setNeighbours(Arrays.asList(vertex3,vertex4, vertex5));
	vertex4.setNeighbours(Arrays.asList(vertex2,vertex6));
	vertex6.setNeighbours(Arrays.asList(vertex0));
	
//	BFS<Integer> bfs=new BFS<Integer>(vertex1);
//	bfs.traverse();
	
	DFS<Integer> dfs=new DFS<Integer>(vertex1);
	dfs.traverse(vertex0);
}
}
