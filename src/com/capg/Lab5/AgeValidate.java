package com.capg.Lab5;

import java.util.Scanner;

public class AgeValidate {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		sc.close();
		
		
		try {
		vote(age);
		}
		catch(AgeLimitException e) {
			System.out.println(e);
			
		}
	}
	
	static void vote(int age) throws AgeLimitException {
		if(age<=15) {
			AgeLimitException e= new AgeLimitException();
			throw e;
		}
		else {
			System.out.println("Age is Valid..");
		}
	}

}
