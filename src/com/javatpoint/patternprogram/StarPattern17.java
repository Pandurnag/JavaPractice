package com.javatpoint.patternprogram;

public class StarPattern17 {
	
	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1;i<=5;i++) {
			
			for(k=5;k>=i;k--) {
			
			System.out.print(" ");
		}
		
		for(j=1;j<(i*2);j++) {
			
			if(j>1 && j<(i*2)-1) {
				
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
		
	}

}
}
