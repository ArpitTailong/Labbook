package com.capg.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5SecondSmallest{  
	public static int getSecondSmallest(int[] a)
	{  
		int aLen=a.length;
		Arrays.sort(a);
		return a[aLen-2];
	}
	public static void main(String args[])
	{  
		Scanner sc= new Scanner(System.in);
		int[] a= new int[5];
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Second smallest: "+getSecondSmallest(a));  
	}
}