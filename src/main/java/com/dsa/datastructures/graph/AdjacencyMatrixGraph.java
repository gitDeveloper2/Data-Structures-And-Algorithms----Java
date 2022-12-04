/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.datastructures.graph;

/**
 *
 * @author dev
 */
public class AdjacencyMatrixGraph {
    public static void main(String[] args) {
        AdjacencyMatrixGraph graph=new AdjacencyMatrixGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        for(int[] arr:graph.getAdjMat()){
            for (int v=0;v<arr.length;v++){
                System.out.print(arr[v]);
                
            }System.out.println("");
        }
        
    }
    
private int [][] adjMat;

    public int[][] getAdjMat() {
        return adjMat;
    }

    public void setAdjMat(int[][] adjMat) {
        this.adjMat = adjMat;
    }

    public AdjacencyMatrixGraph(int nodes) {
        adjMat=new int [nodes][nodes];
    }
    
    public void addEdge(int u, int v){
        this.adjMat[u][v]=1;
        this.adjMat[v][u]=1;
    }
    
}
