
package com.smaran.prepQuestions;

import java.util.*;

class Check7{
	public void m1(String str,int size){
		String[] digits = str.split("");
		int sum = 0;
		int d;
		for(String s : digits){
			d = Integer.parseInt(s);
			sum = sum + (int)Math.pow(d,size);
		}
		if(sum == Integer.parseInt(str))
			System.out.println("True");
		else
			System.out.println("False");
		
		
			
		
	}
}

public class ArmstrongVlaue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Check7 ch = new Check7();
		String str;
		int size;
		
		while(scan.hasNextLine()){
			str = scan.nextLine().trim();
			size = str.length();
			ch.m1(str,size);
		}
		
		scan.close();
		
	}
}
