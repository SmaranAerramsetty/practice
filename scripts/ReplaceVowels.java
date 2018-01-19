

package com.smaran.prepQuestions;

import java.util.*;


public class ReplaceVowels {
	
	
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String s;
		
		while(scan.hasNextLine()){
			s = scan.nextLine().trim();
			System.out.println(s.replaceAll("[aeiou]", ""));
		}
		
		
		scan.close();
	}
}

