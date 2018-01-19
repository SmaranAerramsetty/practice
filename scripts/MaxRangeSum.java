package com.smaran.prepQuestions;

import java.util.Scanner;

public class MaxRangeSum {
	public void main(){
		Scanner scan = new Scanner(System.in);
		String s;
		
		while(scan.hasNextLine()){
			s = scan.nextLine().trim();
			String[] arr = s.split(" ");
        	int[] integers = new int[arr.length];
        	int days = Integer.parseInt(arr[0]);
        	for(int i=0;i<arr.length;i++) {
        		integers[i] = Integer.parseInt(arr[i]);
        	}
        	int maxRangeSum = 0, sum = 0;
    		for (int i = 1; i < integers.length - days + 1; i++) {
    			for (int j = 0; j < days; j++) {
    				sum += integers[i + j];
    			}
    			if (sum > maxRangeSum) {
    				maxRangeSum = sum;
    			}
    			sum = 0;
    		}
    		System.out.println(maxRangeSum);
		}
		
		
		scan.close();
	}
}
