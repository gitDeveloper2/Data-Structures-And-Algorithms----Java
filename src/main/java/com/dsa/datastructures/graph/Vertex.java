package com.dsa.datastructures.graph;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {
	private final T data;
	private boolean visited;
	private List<Vertex<T>> neighbours=new LinkedList();
	
	
	public Vertex(T data) {
		super();
		this.data = data;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex<T>> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<Vertex<T>> neighbours) {
		this.neighbours = neighbours;
	}
	public T getData() {
		return data;
	}
	@Override
	public String toString() {
		return "Vertex [data=" + data + ", visited=" + visited + ", neighbours=" + neighbours + "]";
	}
	
	

}
