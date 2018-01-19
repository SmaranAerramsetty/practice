package com.smaran.prepQuestions;

import java.util.*;

class Check3{
	public void m1(int q0, int p0, int q1, int r1){
		q1 = q1 - q0;
		r1 = r1 - p0;
		if(q1 == 0){
			if(r1 == 0)
				System.out.println("here");
			else if(r1 > 0){
				System.out.println("N");
			}
			else
				System.out.println("S");
		}
		else if(r1 == 0){
			if(q1 > 0){
				System.out.println("E");
			}
			else if(q1 < 0){
				System.out.println("W");
			}
		}
		else if(q1>0){
			if(r1>0)
				System.out.println("NE");
			if(r1<0)
				System.out.println("SE");
		}
		else if(q1<0){
			if(r1>0)
				System.out.println("NW");
			if(r1<0)
				System.out.println("SW");
		}
	}
}

public class LocationCompass {

	public  void m1(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp="";
		String[] str=null;
		Check3 ck = new Check3();
		
		while(scan.hasNextLine()){
			
			temp = scan.nextLine();
			temp = temp.trim();
			str = temp.split(" ", 0);
			int vals[] = new int[4];
			int i=0;
			for(String s:str){
				vals[i++] = Integer.parseInt(s);
			}
			ck.m1(vals[0], vals[1], vals[2], vals[3]);
			
		}
		scan.close();
		
	}
}
