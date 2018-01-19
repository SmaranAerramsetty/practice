package com.smaran.prepQuestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


class Check8{
	public void m1(TreeSet<String> ts){
		ArrayList<String> al = new ArrayList<String>(ts);
		for(int i=0;i<(int)Math.pow(2,ts.size());i++){
			System.out.print("{ ");
			for(int j=0;j<ts.size();j++){
				if( (i & (1<<j)) > 0){
					System.out.print(al.get(j)+" ");
				}
			}
			System.out.println("}");
		}
			
		
	}
}

public class SubSetsList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Check8 ch = new Check8();
		String[] str,t1,t2 = null;
		TreeSet<String> ts = new TreeSet<String>();
		
		
		while(scan.hasNextLine()){
			str = scan.nextLine().trim().split("");
			for(String s: str){
				ts.add(s);
			}
			ch.m1(ts);
			
			
		}
		
		scan.close();
		
	}
}