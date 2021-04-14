package com.capg.Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2CountChar {
	
	static void countChars(char[] ch) {
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		  
        for (char c : ch)
        {
            if(HM.containsKey(c))
               HM.put(c, HM.get(c)+1);
            else
               HM.put(c, 1);
        }
         
        System.out.println(HM);
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the characters");
		String s=sc.nextLine();
		sc.close();
		countChars(s.toCharArray());
	}

}
