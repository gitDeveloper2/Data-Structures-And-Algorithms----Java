/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.algorithms.sorting.bubblesort;

/**
 *
 * @author dev
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        
        int [] array = {12,1,10,50,5,15,45};
        bubbleSort(array);
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");}
        
    }
    
    public static void bubbleSort(int[] array){
            for(int i=0; i<array.length-1;++i){
               for(int j=0; j<array.length-i-1;++j){
                if(array[j+1]<array[j]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            } 
            }
}
}
