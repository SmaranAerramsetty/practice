package com.smaran.prepQuestions;

public class Prime {
	public void m1(){
		long n=1794246913;
		//long n=49;
		int skip=2;
		int flag=1;
		if(n==2||n==3)
		{
			//flag==1;
		}
		else if(n%2==0)
		{
			flag=0;
			System.out.println("found at 2");
		}
		else if(n%3==0)
		{
			flag=0;
			System.out.println("found at 3");
		}
		else if(n%5==0)
		{
			flag=0;
			System.out.println("found at 5");
		}
		else
		{
			for(long i=5;i<n/5;){
				if(flag==0){
					break;
				}
				switch (skip) {
					case 2:						
						i=i+skip;
						skip=4;
						if(n%i==0){
							System.out.println("found at "+i);
							flag =0;
						}
						break;
					case 4:
						i=i+skip;
						skip=2;
						if(n%i==0){
							System.out.println("found at "+i);
							flag =0;
						}
						break;
				}
			}
		}
		if(flag==1){
			System.out.println("Prime");
		}
		else
			System.out.println("Not a Prime");
	}
}
