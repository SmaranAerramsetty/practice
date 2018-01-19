
package com.smaran.prepQuestions;

import java.util.*;

class Check5{
	public void m1(ArrayList<Integer> al){
		boolean flag = true;
		boolean flag2 = false;
		
		for(int i=1;i<al.size();i++){
			flag2 = false;
			for(int x=0;x<al.size()-1;x++){
				if(i == Math.abs(al.get(x).intValue() - al.get(x+1).intValue())){
					flag2 = true;
					break;
				}
			}
			if(flag2 == false){
				flag = false;
				break;
			}
				
		}
		if(flag){
			System.out.println("Jolly");
		}
		else
			System.out.println("Not Jolly");
		
	}
}

public class JollyJumper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp;
		ArrayList<Integer> al = new ArrayList<Integer>();
		String[] vals = null;
		Check5 ch = new Check5();
		
		while(scan.hasNextLine()){
			temp = scan.nextLine();
			temp = temp.trim();
			vals = temp.split(" ");
			for(String s:vals){
				al.add(Integer.valueOf(Integer.parseInt(s)));
			}
			ch.m1(al);
			al.clear();
		}
		scan.close();
		
	}
}
