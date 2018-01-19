package com.smaran.prepQuestions;

import java.util.*;



public class FormatConversions {

	public void m1(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		
		while(scan.hasNextLine()){
			str = scan.nextLine().trim();
			System.out.println("Converting int to other formats..");
			System.out.println("Binary->"+Integer.toBinaryString(Integer.parseInt(str)));
			System.out.println("Octal->"+Integer.toOctalString((Integer.parseInt(str))));
			System.out.println("Hexaddecimal->"+Integer.toHexString((Integer.parseInt(str))));
			//ch.m1(str,size);
			System.out.println("===================================");
			System.out.println("Converting Other formats to int..");
			System.out.println("Binary-> "+Integer.parseInt(str, 2));
			System.out.println("Ocatal-> "+Integer.parseInt(str, 8));
			System.out.println("Decimal-> "+Integer.parseInt(str, 10));
			System.out.println("Hexadecimal-> "+Integer.parseInt(str, 16));
			System.out.println("====================================");
			System.out.println("Converting Hex to Oct");
			int d = Integer.parseInt(str,16);
			System.out.println("Octal->"+Integer.toOctalString(d));
			
		}
		
		scan.close();
		
	}
}
