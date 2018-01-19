
package com.smaran.prepQuestions;

import java.util.*;

class Check6{
	public void m1(String[] str){
		HashMap<String, String> hm = new HashMap<String, String>();
		String[] temp = null;
		for(String s:str){
			temp = s.split("-");
			hm.put(temp[0], temp[1]);
		}
		String t1;
		String t2;
		boolean flag=true;
		if(hm.containsKey("BEGIN")){
			t1 = hm.get("BEGIN");
			hm.remove("BEGIN");
			while(t1!=null){
				t2 = t1;
				if(t1.equals("END")){
					break;
				}
				t1 = hm.get(t2);
				hm.remove(t2);
				
			}
			if(t1 == null){
				flag = false;
			}
		}
		else{
			flag = false;
		}
			if(flag && hm.size()==0)
				System.out.println("GOOD");
			else
				System.out.println("BAD");
			
		
	}
}

public class ChainCheck {

	public static void main(String[] args) {
		//File file = new File(args[0]);
		//Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		String[] str = null;
		Check6 ch = new Check6();
		
		while(scan.hasNextLine()){
			str = scan.nextLine().trim().split(";");
			ch.m1(str);
		}
		
		scan.close();
		
	}
}

