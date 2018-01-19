package com.smaran.prepQuestions;

import java.util.Scanner;

public class Coins {
	public void main(){
		Scanner scan = new Scanner(System.in);
		
		String s;
		int total,fiveTimes,threeTimes,oneTimes;
		
		while(scan.hasNextLine()){
			s = scan.nextLine().trim();
			total = Integer.parseInt(s);
        	fiveTimes = total / 5;
        	total = total - (fiveTimes * 5);
        	threeTimes = total / 3;
        	total = total - (threeTimes * 3);
        	oneTimes = total;
        	System.out.println(fiveTimes + threeTimes + oneTimes);
		}
		scan.close();
	}
}
