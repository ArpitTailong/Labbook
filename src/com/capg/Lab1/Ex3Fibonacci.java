package com.capg.Lab1;

import java.util.Scanner;

class Ex3Fibonacci{  
public static void main(String args[])  
{    
 int a=0,b=1,c,n;    
 Scanner sc = new Scanner(System.in);
 n=sc.nextInt();
 a=sc.nextInt();
 b=sc.nextInt();
 System.out.print(a+" "+b);//printing 0 and 1    
    
 for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
  
}}