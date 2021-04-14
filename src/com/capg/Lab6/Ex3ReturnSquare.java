package com.capg.Lab6;

import java.util.*;
 
public class Ex3ReturnSquare {
 
  public static HashMap<Integer,Integer> getSquares(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
    for (int n: arr) {
      map.put(n,n*n);
    }
    return map;
  }
 
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] a= new int[5];
    System.out.println("enter array values");
    for(int i=0;i<5;i++) {
    	a[i]=sc.nextInt();
    }
    sc.close();
    HashMap<Integer, Integer> map = getSquares(a);
    
    for(Map.Entry<Integer,Integer> e:map.entrySet()) {
    	System.out.println(e.getKey()+" : "+e.getValue());
    }
  }
}