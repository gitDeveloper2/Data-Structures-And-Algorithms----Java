/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.algorithms.sorting.insertionsort;

/**
 *
 * @author dev
 */
public class MyInsertionSort {
    public static void main(String[] args) {
         int [] array = {10,5,3,1,24,12};
        
        insertionSort(array);

        for(int i = 0; i<array.length; ++i){
            System.out.print(array[i] + " ");
        }
    }
    
    public static void insertionSort(int [] array){
    for(int i=0;i<array.length;++i){//set up growing array and +1 element
        int j=i;
        
        while(j>0 && array[j-1]>array[j]){
            int temp =array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            j--;
        }
        
        
    }
    }
}
