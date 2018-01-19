
package com.smaran.prepQuestions;

import java.util.*;



public class PalindromeSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] str = null;
		boolean flag=true;
		ArrayList<Integer> al = new ArrayList<Integer>();
		String s2;
		int n;
		
		while(scan.hasNextLine()){
			s2 = scan.nextLine().trim();
			str = s2.split("");
			n = Integer.parseInt(s2);
			s2="";
			for(int i = str.length-1;i!=-1;i--)
				s2 = s2 + str[i];
			s2 = (n + Integer.parseInt(s2)) + "";	
			for(int i=0;i<s2.length()/2;i++)
				if(s2.charAt(i)!=s2.charAt(s2.length()-1-i))
					flag = false;
			
			//System.out.println(s2);
			if(flag)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
			s2="";
			str = null;
			
		}
		
		scan.close();
		
	}
}
