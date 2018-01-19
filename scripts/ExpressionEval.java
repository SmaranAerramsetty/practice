package com.smaran.prepQuestions;

import java.util.*;



public class ExpressionEval {
	
	static String op;
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);

		String input = "776 ab-c";
		String num = input.split(" ")[0];
		String exp = input.split(" ")[1];
		int index;
		if(exp.contains("+")){
			index = exp.indexOf("+");
			System.out.println(Long.parseLong(num.substring(0, index)) + Long.parseLong(num.substring(index)));
		}
		else if(exp.contains("-")){
			index = exp.indexOf("-");
			System.out.println(Long.parseLong(num.substring(0, index)) - Long.parseLong(num.substring(index)));
		}
		scan.close();
	}
}

