

package com.smaran.prepQuestions;

import java.util.*;
import java.util.regex.*;


public class MixedArray {
	
	
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String vals[] = null;
		Pattern p = Pattern.compile("\\d+");
		Matcher m;
		StringBuilder integersList = new StringBuilder();
		StringBuilder stringsList = new StringBuilder();
		
		
		while(scan.hasNextLine()){
			vals = scan.nextLine().trim().split(",");
			for(String s:vals){
				m = p.matcher(s);
				if(m.find()){
					integersList.append(s+",");
				}else
					stringsList.append(s+",");
			}
			if(integersList.length()>0)
				integersList.deleteCharAt(integersList.length()-1).append("|");
			if(stringsList.length()>0)
				stringsList.deleteCharAt(stringsList.length()-1).append("|");
			
			System.out.println(stringsList.append(integersList));
		}
		
		
		scan.close();
	}
}

