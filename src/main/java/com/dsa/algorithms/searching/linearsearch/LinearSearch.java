/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.algorithms.searching.linearsearch;

/**
 *
 * @author dev
 */
public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {5,2,12,12,1};
        int res=linearSearch(1, array);
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+res);
        }
    }
public static int linearSearch(int searchKey,int[] array){
    for(int i=0; i<array.length;i++){
        if(searchKey==array[i]){
            return i;
        }
       
    }
    return -1;
}
}
