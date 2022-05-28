package com.javatpoint.multithreading;

public class ReentrantExample{  
public static void main(String args[]){  
final ReentrantExample re=new ReentrantExample();  
  
Thread t1=new Thread(){  
public void run(){  
//((Object) re).m();//calling method of Reentrant class  
}  
};  
t1.start();  
}}  