
package com.smaran.prepQuestions;

import java.util.*;
import java.io.*;


public class HiddenNum {
	
	static String op;
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		
		
		String line;
        while (scan.hasNextLine()) {
			line = scan.nextLine();
        	String result = "";
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i); 
				if (ch >= 'a' && ch <= 'j') {
					result += ch - 'a'; 
				} else if (ch >= '0' && ch <= '9') {
					result += ch; 
				}
			}
			
			if (result.equals("")) {
				System.out.println("NONE");
			} else {
				System.out.println(result);
			}
		}
		scan.close();
	}
}

