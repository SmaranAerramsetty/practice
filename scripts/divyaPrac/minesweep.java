package com.smaran.prepQuestions;

import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
        String[][] in = {
        		{".",	".",	"m",	".",	"m"},
        		{"m",	".",	".",	"m",	"m"},
        		{"m",	".",	".",	".",	"."},
        		{".",	".",	".",	".",	"."},
        		{".",	".",	".",	"m",	"."}
        		};
        
        //int[][] op = new int[in.length][in.length];
        int[][] op = {
        		{5,5,5,5,5},
        		{5,5,5,5,5},
        		{5,5,5,5,5},
        		{5,5,5,5,5},
        		{5,5,5,5,5}
        };
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet<String> corners = new HashSet<String>();
        
      //first rule
        for(int i=0; i<in.length;i++){
        	for(int j=0; j<in.length; j++){
        		if(in[i][j] == "m"){
        			op[i][j] = -1;
        			if(i-1!=-1){
        				if(j-1!=-1)
        					corners.add((i-1)+","+(j-1));
        				if(j+1 != in.length)
        					corners.add((i-1)+","+(j+1));
        			}
        			if(i+1 != in.length){
        				if(j-1!=-1)
        					corners.add((i+1)+","+(j-1));
        				if(j+1 != in.length)
        					corners.add((i+1)+","+(j+1));
        			}
        			if(j+1<in.length){
        				op[i][j+1] = 0;
        			}
        			if(i+1<in.length && op[i+1][j]!=-1 && op[i+1][j]!=0){
        				op[i+1][j] = 2;
        			}
        			if(i>0 && j>0 && i<in.length-1 && j<in.length-1){
        				if(op[i-1][j-1]!=0 && op[i-1][j-1]!=2 && op[i-1][j-1]!=-1)
        					op[i-1][j-1] = 1;
        				if(op[i-1][j]!=0 && op[i-1][j]!=2 && op[i-1][j]!=-1)
        					op[i-1][j] = 1;
        				if(op[i-1][j+1]!=0 && op[i+1][j-1]!=2 && op[i-1][j+1]!=-1)
        					op[i-1][j+1] = 1;
        				if(op[i][j-1]!=0 && op[i][j-1]!=2 && op[i][j-1]!=-1)
        					op[i][j-1] = 1;
        				if(op[i+1][j-1]!=0 && op[i+1][j-1]!=2 && op[i+1][j-1]!=-1)
        					op[i+1][j-1] = 1;
        				if(op[i+1][j+1]!=0 && op[i+1][j+1]!=2 && op[i+1][j+1]!=-1)
        					op[i+1][j+1] = 1;
        			}
        			if(i==0){
        				if(j-1!=-1 && op[0][j-1]!=0 && op[0][j-1]!=2 && op[0][j-1]!=-1)
        					op[0][j-1] = 1;
        				if(j-1!=-1 && op[1][j-1]!=0 && op[1][j-1]!=2 && op[1][j-1]!=-1)
        					op[1][j-1] = 1;
        				if(j+1!=in.length && op[1][j+1]!=0 && op[1][j+1]!=2 && op[1][j+1]!=-1)
        					op[1][j+1] = 1;
        			}
        			if(i==in.length-1){
        				if(j-1!=-1 && op[in.length-1][j-1]!=0 && op[in.length-1][j-1]!=2 && op[in.length-1][j-1]!=-1)
        					op[in.length-1][j-1] = 1;
        				if(j-1!=-1 && op[in.length-2][j-1]!=0 && op[in.length-2][j-1]!=2 && op[in.length-2][j-1]!=-1)
        					op[in.length-2][j-1] = 1;
        				if(op[in.length-2][j]!=0 && op[in.length-2][j]!=2 && op[in.length-2][j]!=-1)
        					op[in.length-2][j] = 1;
        				if(j+1!=in.length && op[in.length-2][j+1]!=0 && op[in.length-2][j+1]!=2 && op[in.length-2][j+1]!=-1)
        					op[in.length-2][j+1] = 1;
        			}
        			if(j==0 && i>0 && i<in.length-1){
        				if(op[i-1][0]!=0 && op[i-1][0]!=2 && op[i-1][0]!=-1)
        					op[i-1][0] = 1;
        				if(op[i-1][1]!=0 && op[i-1][1]!=2 && op[i-1][1]!=-1)
        					op[i-1][1] = 1;
        				if(op[i+1][1]!=0 && op[i+1][1]!=2 && op[i+1][1]!=-1)
        					op[i+1][1] = 1;
        			}
        			if(j==in.length-1 && i>0 && i<in.length-1){
        				if(op[i-1][in.length-1]!=0 && op[i-1][in.length-1]!=2 && op[i-1][in.length-1]!=-1)
        					op[i-1][in.length-1] = 1;
        				if(op[i-1][in.length-2]!=0 && op[i-1][in.length-2]!=2 && op[i-1][in.length-2]!=-1)
        					op[i-1][in.length-2] = 1;
        				if(op[i][in.length-2]!=0 && op[i][in.length-2]!=2 && op[i][in.length-2]!=-1)
        					op[i][in.length-2] = 1;
        				if(op[i+1][in.length-2]!=0 && op[i+1][in.length-2]!=2 && op[i+1][in.length-2]!=-1)
        					op[i+1][in.length-2] = 1;
        			}
        		}
        	}
        }
         int temp=0;
        for(int x=0;x<al.size();x=x+2){
        	int row = al.get(x);
        	if(row%2 != 0 && row!=temp){
        		temp = row;
        		for(int i=row,j=0; j<op.length; j++)
        			if(op[i][j] !=-1 && op[i][j] !=5)
        				op[i][j] = op[i][j]*3;
        	}
        }
        
        for(String s : corners){
        	int x = Integer.parseInt(s.split(",")[0]);
        	int y = Integer.parseInt(s.split(",")[1]);
        	if(op[x][y] != -1)
        		op[x][y] = op[x][y]*2;
        }
        
        for(int i=0;i<in.length;i++){
        	System.out.print("[ ");
        	for(int j=0;j<in.length;j++){
        		System.out.print(op[i][j]+"\t");
        	}
        	System.out.println("]");
        }
        
        
    }
    
}
