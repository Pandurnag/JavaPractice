package com.javatpoint.multithreading;

public class MainForRunnable {
	
	public static void main(String[] args) {
		
		RunnableDemo runnableDemo  = new RunnableDemo();
		
		Thread thread = new Thread(runnableDemo);
		thread.start();
		
		for(int i=0; i<1000;i++)
		{
			System.out.println("Iam executed by Main thread");
		}

		
	}
	
	
	}


