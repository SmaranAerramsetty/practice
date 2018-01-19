
package com.smaran.prepQuestions;

import java.util.*;

class Check4{
	public void m1(ArrayList<Integer> al){
		int sumL=0;
		int sumU=0;
		int k;
		boolean flag=false;
		for(int i=1;i<al.size();i++){
			k=0;
			for(k=0;k<i;k++){
				sumL = sumL+ al.get(k).intValue();
			}
			k++;
			for(;k<al.size();k++){
				sumU = sumU + al.get(k).intValue();
			}
			//System.out.println("for index "+i+" the sumL:"+sumL+" and sumU:"+sumU);
			if((sumL==sumU)||(sumL+sumU)==0){
				flag = true;
				System.out.println("ans: "+(i+1));
			}
			else{
				sumL=0;
				sumU=0;
			}
			
		}
		if(!flag){
			System.out.println("-1");
		}
	}
}

public class Equilibrium {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Check4 ck = new Check4();
		int tests = scan.nextInt();
		scan.nextLine();
		int size;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(tests!=0){
			size = scan.nextInt();
			scan.nextLine();
			
			for(int i=0;i<size;i++){
				al.add(Integer.valueOf(scan.nextInt()));
			}
			if(size == 1){
				System.out.println(al.get(0));
			}
			else{
				ck.m1(al);
			}
			
			al.clear();
			tests--;
			
			
		}
		scan.close();
		
	}
}
