

package com.smaran.prepQuestions;

import java.util.*;
import java.io.*;


class Check10{
	void m1(int[] arr1, int[] arr2){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					ts.add(arr1[i]);
				}
			}
		}
		System.out.println(ts);
	}
}
public class CommonArrayElements {
	
	static String op;
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String[] str = null;
		String temp;
		int[] arr1 = null;
		int[] arr2 = null;
		int i=0;
		Check10 ch = new Check10();
		while(scan.hasNextLine()){
			temp  = scan.nextLine().trim();
			str = temp.split(";")[0].split(",");
			arr1 = new int[str.length];
			for(String s:str){
				arr1[i++] = Integer.parseInt(s);
			}
			str = temp.split(";")[1].split(",");
			arr2 = new int[str.length];
			i=0;
			for(String s:str){
				arr2[i++] = Integer.parseInt(s);
			}
			ch.m1(arr1,arr2);
			
		}
		scan.close();
	}
}

