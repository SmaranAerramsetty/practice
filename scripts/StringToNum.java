package com.smaran.prepQuestions;


import java.util.*;

class Check1{
	public boolean m1(String str){
		char[] ch = str.toCharArray();
		//System.out.println();
		System.out.print("[ ");
		for(char c:ch){
			System.out.print((int)Character.toUpperCase(c)-65);
		}
		System.out.println(" ]");
		return true;
	}
}

public class StringToNum {

	public void m2(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp="";
		Check1 ck = new Check1();
		
		while(scan.hasNextLine()){
			//System.out.print("Enter string: ");
			temp = scan.nextLine();
			ck.m1(temp);
			
		}
		scan.close();
		
		
	}
}

