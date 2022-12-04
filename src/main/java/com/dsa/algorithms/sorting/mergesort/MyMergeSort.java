package com.dsa.algorithms.sorting.mergesort;

import java.util.Arrays;

/**
 *
 * @author dev
 */
public class MyMergeSort {
    
    public static void main(String[] args) {
        int [] array = {12,1,10,50,5,15,45};
        order(array);
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
    }
    public static void order(int [] arr){
        int len=arr.length;
        if(len==1){
            return;
        }
        
        int[] left=Arrays.copyOfRange(arr, 0,len/2 );
        int[] right=Arrays.copyOfRange(arr, len/2, len);
 
        order(right);
        order(left) ;
        //return 
        merge(left,right, arr);
        
    }

    private static void merge(int[] left, int[] right, int[] arr) {
         int i=0,l=0,r = 0;
        while(l<left.length && r<right.length){
       
            
          
            
           if( left[l]<right[r]){
               arr[i++]=left[l++];
           }
           else{
               arr[i++]=right[r++];
           }
        }
        while(l<left.length){
            arr[i++]=left[l++];
        }
        while(r<right.length){
            arr[i++]=right[r++];
        }
    }
}
