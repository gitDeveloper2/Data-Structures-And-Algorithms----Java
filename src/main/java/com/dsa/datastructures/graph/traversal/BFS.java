package com.dsa.datastructures.graph.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.dsa.datastructures.graph.Vertex;

public class BFS<T> {
	private final Vertex<T> startVertex;
	
	public BFS(Vertex<T> startVertex) {
		super();
		this.startVertex = startVertex;
	}
	public void traverse() {
		Queue<Vertex<T>> queue=new LinkedList();
		queue.add(startVertex);
		while(!queue.isEmpty()) {
			Vertex<T> current= queue.poll();//move to next element
			if(!current.isVisited()) {
			current.setVisited(true);
			System.out.println("Vertex(data:"+current.getData()+", visited: "+current.isVisited()+")");
			queue.addAll(current.getNeighbours());
			}
		}
	}
	public Vertex<T> getStartVertex() {
		return startVertex;
	}
	
}
