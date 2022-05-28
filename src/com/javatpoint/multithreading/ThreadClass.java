package com.javatpoint.multithreading;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10;i++)
		{
			System.out.println("Iam executed by child thread" +i);
			System.out.println("Iam demon or not  thread" + Thread.currentThread().getName());
		}
	}

}
