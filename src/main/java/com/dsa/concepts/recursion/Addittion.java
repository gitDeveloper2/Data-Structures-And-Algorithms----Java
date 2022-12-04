/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.concepts.recursion;

/**
 *
 * @author dev
 */
public class Addittion {
    public int add(int num){
        if(num==1){
            return 1;
        }
        else{
            return num+add(num-1);
        }
    }
    public static void main(String[] args) {
        Addittion addittion=new Addittion();
       int res= addittion.add(5);
       
        System.out.println(res);
       
       
    }
}
