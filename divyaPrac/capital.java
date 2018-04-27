package com.smaran.prepQuestions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        String regex = "(next)Capital"; //nextcapital  nExtCapital nextcap fadfadf ['n','e','x','t'] 
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
       
        String str = scan.nextLine();
        str = str.replaceAll("[s|S]","5");
        int len = str.length();
        if((len != 1) && (len%2 != 0)){
        	int middle = len/2;
        	str = str.substring(0,middle)+(Integer.parseInt(str.charAt(middle)+"")*2)+str.substring(middle+1);
        }
        else {
        	char f = str.charAt(0);
        	char l = str.charAt(len-1);
        	str = ((Character.isUpperCase(l)) ? Character.toLowerCase(l) : Character.toUpperCase(l)) + str.substring(1,len-1) + ((Character.isUpperCase(f)) ? Character.toLowerCase(f) : Character.toUpperCase(f));
        }
        Matcher m = p.matcher(str);
        if(m.find()){
        	char[] nexts = m.group(1).toCharArray();
        	String nextRev = "";
        	for(int i=nexts.length-1;i>-1;i--){
        		nextRev = nextRev + nexts[i];
        	}
        	str = str.substring(0,m.start()) + nextRev + str.substring(m.start()+4);
        }
        
        System.out.println(str);
        
        scan.close();
    }
}
