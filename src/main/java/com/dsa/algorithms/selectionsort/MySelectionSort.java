package com.dsa.algorithms.selectionsort;
/**
 *
 * @author dev
 */
public class MySelectionSort {
    public static void main(String[] args) {
              int array[] = {90,1,4,100,8,2};
               selectionSort(array);
               for(int v:array){
                   System.out.print(v +"  ");
               }
    }
    
    public static void selectionSort(int [] array){
        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;   
                }
        }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
            
        }
        
    }
}
