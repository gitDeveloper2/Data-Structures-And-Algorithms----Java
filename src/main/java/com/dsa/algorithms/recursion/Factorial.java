/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dsa.algorithms.recursion;

/**
 *
 * @author dev
 */
public class Factorial {
    public int factorial(int num){
        if(num==1){
            return num;
        }
        else{
        return num*factorial(num-1);
    }
    
    }
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        int res=factorial.factorial(5);
        System.out.println(res);
    }
}
