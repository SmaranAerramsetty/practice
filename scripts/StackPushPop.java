
package com.smaran.prepQuestions;

import java.util.*;
import java.io.*;



public class StackPushPop {
	
	static String op;
	public static void main(String[] args){
		
		int[] arr = {5,3,6,8,7,9,5};
		System.out.println("My stack is:"+myStack(arr));
		System.out.println("Popped1: "+pop());
		System.out.println("Popped2: "+pop());
		System.out.println("Popped3: "+pop());
		push(3);
		System.out.println("Pushed 3:: "+op);
		push(6);
		System.out.println("Pushed 6: "+op);
		push(2);
		System.out.println("Pushed 2: "+op);
		System.out.println("Finally"+op);
		
	}
	
	static String myStack(int[] arr){
		op = "";
		for(int n:arr){
			push(n);
		}
		op = op.trim();
		
		return op;
	}
	static int pop(){
		String[] vals = op.trim().split(" ");
		int n = Integer.parseInt(vals[vals.length-1]);
		
		op = "";
		for(int i=0;i<vals.length-1;i++){
			push(Integer.parseInt(vals[i]));
		}
		System.out.println("New array after pop:"+op);
		
		return n;
	}
	
	static void push( int n){
		op = op+" "+n;
	}
}

