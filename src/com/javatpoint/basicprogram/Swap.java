package com.javatpoint.basicprogram;

public class Swap {
	
	public static void main(String[] args) {
		
		int x=20;
		int y=25;
		System.out.println("Before Swapping Number " +x+" "+y);
		{
			x=x+y;
			y=x-y;
			x=x-y;
			
			System.out.println("After Swapping Number " +x+" "+y);
		}
	}

}
