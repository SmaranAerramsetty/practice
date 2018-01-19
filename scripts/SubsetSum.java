
package com.smaran.prepQuestions;

import java.util.*;

class Check9{
	public void m1(ArrayList<Integer> al){
		int sum = 0;
		int count=0;
		for(int i=0;i<(int)Math.pow(2,al.size());i++){
			sum =0;
			//System.out.print("{ ");
			for(int j=0;j<al.size();j++){
				if( (i & (1<<j)) > 0){
					sum = sum + al.get(j);
				}
			}
			//System.out.println("}");
			if(sum == 0){
				count++;
			}
		}
		System.out.println("The ans is : "+count);
		
	}
}

public class SubsetSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Check9 ch = new Check9();
		String[] str,t1,t2 = null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		while(scan.hasNextLine()){
			str = scan.nextLine().trim().split(" ");
			for(String s: str){
				al.add(Integer.parseInt(s));
			}
			ch.m1(al);
			al.clear();
			
			
		}
		
		scan.close();
		
	}
}

