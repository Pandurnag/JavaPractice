package com.javatpoint.patternprogram;

public class StarPattern3 {
	
	public static void main(String[] args) {
		
		int i,j;
		System.out.println("Combine rverse and right triangle");
		
		for(i=1;i<=4;i++) 
		{
			
			for(j=1;j<=i;j++) 
			{
				
			System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=4;i++) {
			
			for(j=3;j>=i;j--) {
				
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
