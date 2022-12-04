/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.datastructures.graph;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author dev
 */
public class AdjacencyListGraph {
    LinkedList<Integer>[] list;

    public AdjacencyListGraph(int nodes) {
        this.list = new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.list[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u, int v){
        this.list[u].add(v);
        this.list[v].add(u);
        
    }
    
    
    public static void main(String[] args) {
        AdjacencyListGraph graph=new AdjacencyListGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        for(LinkedList<Integer> linked:graph.list){
            for (int l:linked){
                System.out.print(l);    
                
            }System.out.println("");
        }
    }
            
            
}
