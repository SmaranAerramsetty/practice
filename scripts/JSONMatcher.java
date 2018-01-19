

package com.smaran.prepQuestions;

import java.util.*;
import java.io.*;
import java.util.regex.*;


public class JSONMatcher {
	
	static String op;
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String s="";
		int sum=0;
		Pattern p;
		Matcher m;
		while(scan.hasNextLine()){
			s = scan.nextLine().trim();
			if(s.length()!=0){
				p = Pattern.compile("\"id\": (\\d+), \"label\"");//p = Pattern.compile("\"id\": (\\d+)");
				m = p.matcher(s);
				while(m.find())
					sum = sum + Integer.parseInt(m.group(1));
			}
			System.out.println("Answer is:"+sum);
				
		}
		
		
		scan.close();
	}
}

