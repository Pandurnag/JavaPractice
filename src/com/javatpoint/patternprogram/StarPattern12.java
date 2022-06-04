package com.javatpoint.patternprogram;

public class StarPattern12 {
	
	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=1;i<=4;i++) {
			
		for( j=1;j<=i;j++) {
			
			System.out.print(" ");
			
		}
		for( k=9;k>(i*2);k--)
		{
			System.out.print("*");
		}
		System.out.println();
			
		}
	}

}
