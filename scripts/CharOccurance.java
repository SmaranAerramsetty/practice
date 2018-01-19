package com.smaran.prepQuestions;



import java.util.Arrays;
import java.util.Scanner;

class Check2{
	public void m1(String str){
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			ch[i] = Character.toLowerCase(ch[i]);
		}
		Arrays.sort(ch);
		int count=0;
		char temp = ch[0];
		for(int i=0;i<ch.length;i++){
			if(temp == ch[i]){
				count++;
			}
			else{
				System.out.print(temp+""+count);
				temp = ch[i];
				count=1;
			}
		}
		System.out.print(temp+""+count);
	}
}

public class CharOccurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp="";
		Check2 ck = new Check2();
		
		while(scan.hasNextLine()){
			
			temp = scan.nextLine();
			ck.m1(temp);
			
		}
		scan.close();
		
	}
}
