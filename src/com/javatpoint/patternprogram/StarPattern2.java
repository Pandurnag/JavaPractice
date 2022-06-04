package com.javatpoint.patternprogram;

public class StarPattern2 {
	
	public static void main(String[] args) {
		
	   int i,j;
	   
	   System.out.println("Revese Traingle");
	   for(i=1;i<=4;i++) {
		   
		   for(j=4;j>=i;j--) {
			   
			   System.out.print("*");
			   
		   }
		   System.out.println("");
	   }
		
	}

}
