package com.javatpoint.multithreading;

class UserThread extends Thread{
	public void run() 
	{
		//task.for.thread...
		System.out.println("This is user defined thread.");
		
	}
}

public class ThreadOp {
	
	public static void main(String[] args) {
		System.out.println("Program Started..");
		int x=50+50;
		System.out.println("Sum is "+x);
		
		//Thread...
		
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("Current running thread is " +tname);
		
		//SetName
		t.setName("MyMain");
		System.out.println(t.getName());
		
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		};
		
		System.out.println(t.getId());
		
		//going to start user defined thread.
		
		System.out.println("Program Ended..");
		UserThread thread=new UserThread();
		thread.start();
		
		
		
	}

}
