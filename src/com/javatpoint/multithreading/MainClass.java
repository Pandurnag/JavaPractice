package com.javatpoint.multithreading;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadClass threadClass = new ThreadClass();
		
		threadClass.start();
		
		for(int i=0; i<10;i++)
		{
			System.out.println("Iam executed by Main thread" +i);
		}
	}

}
