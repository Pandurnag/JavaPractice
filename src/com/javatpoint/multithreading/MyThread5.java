package com.javatpoint.multithreading;

import java.util.Iterator;

public class MyThread5 implements Runnable 
{

	@Override
	public void run() {
		// Task for thread...
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i is " +i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
public static void main(String[] args) {
	//create object of MyThread class
	
	MyThread5 t1=new MyThread5();
	Thread thr=new Thread(t1);
	
	//object of Another Thread
	
	MyAnotherThread t2=new MyAnotherThread();
	thr.start();
	t2.start();
}
}
