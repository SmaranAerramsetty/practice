

package com.smaran.prepQuestions;

import java.util.*;


public class ReverseString {
	
	
	public  void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String s[];
		String out="";
		
		while(scan.hasNextLine()){
			s = scan.nextLine().trim().split(" ");
			for(int i=s.length-1;i!=-1;i--)
				out = out + s[i] + " "; 
			System.out.println(out.trim());
		}
		
		
		
		scan.close();
	}
}

