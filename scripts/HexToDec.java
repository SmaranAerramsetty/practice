package com.smaran.prepQuestions;

public class HexToDec {
	public void m1(){
		long n=12442151;
		long sum=0;
		int temp1;
		int i=0;
		boolean flag=true;
		while(flag){
			if(n>9){
				temp1 = (int)n%10;
				sum = sum + temp1*(long)Math.pow(16, i);
				System.out.println("Here num: "+temp1+" gets 16^"+i+" givs res: "+sum);
				i++;
				n=n/10;
			}
			else{
				sum = sum + n*(long)Math.pow(16, i);
				System.out.println("Here num: "+n+" gets 16^"+i+" givs res: "+sum);
				flag = false;
			}
				
						
		}
		System.out.println("Value is "+sum);
	}
}
