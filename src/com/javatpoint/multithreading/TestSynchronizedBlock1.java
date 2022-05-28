package com.javatpoint.multithreading;

class Table11 
{      
 void printTable(int n){    
   synchronized(this){//synchronized block    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }//end of the method    
}    
    
class MyThread25 extends Thread{    
Table t;    
MyThread25(Table t){    
this.t=t;    
}    
public void run(){    
t.printTable(5);    
}    
    
}    
class MyThread26 extends Thread{    
Table t;    
MyThread26(Table t){    
this.t=t;    
}    
public void run(){    
t.printTable(100);    
}    
}    
    
public class TestSynchronizedBlock1{    
public static void main(String args[]){    
Table obj = new Table();//only one object    
MyThread25 t1=new MyThread25(obj);    
MyThread26 t2=new MyThread26(obj);    
t1.start();    
t2.start();    
}    
}     