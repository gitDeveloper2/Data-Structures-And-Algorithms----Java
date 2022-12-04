/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.algorithms.searching.binarysearch;

/**
 *
 * @author dev
 */
public class MyBinarySearch {
    public static void main(String[] args) {
        int numArray[] = {0,1,2,3,4,5,7}; 
       int res= binarySearch(numArray, 7);
      
      String result=(res==-1)? "not found":"found";
        System.out.println("result"+result);
    }
    
    public static int binarySearch(int [] array, int key){
        int first=0;
        int last= array.length-1;
       
        while(first<=last){
             int mid=(first+last)/2;
            if(key>array[mid]){
                first=mid+1;
            }
            else if(key<array[mid]){
                last=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
