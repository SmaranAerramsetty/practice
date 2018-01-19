
package com.smaran.prepQuestions;

import java.util.*;
import java.util.regex.*;


public class DistanceBtwnPts {
	
	
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(Sywhatsstem.in);
			String s;
			Pattern p = Pattern.compile("^\\(([\\d-]+), ([\\d-]+)\\) \\(([\\d-]+), ([-\\d]+)\\)$");
			Matcher m;
			int x1=0,x2=0,y1=0,y2=0,xDiff,yDiff;
			double distance;
			while(scan.hasNextLine()){
				s = scan.nextLine().trim();
				m = p.matcher(s);
				if(m.find()){
					x1 = Integer.parseInt(m.group(1));
					y1 = Integer.parseInt(m.group(2));
					x2 = Integer.parseInt(m.group(3));
					y2 = Integer.parseInt(m.group(4));
				}
				xDiff = x1 - x2;
				yDiff = y1 - y2;
				distance = Math.sqrt((xDiff * xDiff)+(yDiff*yDiff));
				System.out.println(distance);
				
			}
			
			scan.close();
			
		}
}

