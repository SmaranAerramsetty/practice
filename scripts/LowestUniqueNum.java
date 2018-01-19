
package com.smaran.prepQuestions;

import java.util.*;


public class LowestUniqueNum {
	
	
	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		String vals[] = null;
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		int temp;
		int unique = 0;
		while(scan.hasNextLine()){
			vals = scan.nextLine().trim().split(" ");
			for(String s:vals){
				temp = Integer.parseInt(s);
				if(tm.containsKey(temp)){
					tm.put(temp, temp+1);
				}
				else
					tm.put(temp, 1);
			}
			unique=0;
			boolean flag = false;
			for(Map.Entry<Integer,Integer> m: tm.entrySet()){
				if(m.getValue() == 1){
					flag = true;
					unique = m.getKey();
					break;
				}
			}
				System.out.println("Found unique :"+unique);										
				
				if(flag){
					for(int i=0;i<vals.length;i++){
						if(vals[i].equals(unique+"")){
							System.out.println("Position is:"+(i+1));
							break;
						}					
					}
				} else
					System.out.println("Position is:0");
			tm.clear();
			
				
		}
		
		
		scan.close();
	}
}

