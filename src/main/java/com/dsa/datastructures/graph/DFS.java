package com.dsa.datastructures.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DFS<T> {
	private final Vertex<T> startVertex;
	
	public DFS(Vertex<T> startVertex) {
		super();
		this.startVertex = startVertex;
	}
	public void traverse(Vertex<T> startVertex) {
		startVertex.setVisited(true);
		System.out.println(startVertex.getData());
		for(Vertex<T> v:startVertex.getNeighbours()) {
			if(!v.isVisited()) {
			traverse(v);
			}
		}
		
	}
	public Vertex<T> getStartVertex() {
		return startVertex;
	}
	
}
