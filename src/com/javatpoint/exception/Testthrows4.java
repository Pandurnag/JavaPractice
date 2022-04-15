package com.javatpoint.exception;

import java.io.*;  
class M5{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M5 m=new M5();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  