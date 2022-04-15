package com.javatpoint.exception;

import java.io.*;    
class Parent12{    
  void msg()throws ArithmeticException {  
    System.out.println("parent method");  
  }    
}    
    
public class TestExceptionChild2 extends Parent12{    
 // void msg()throws Exception {  
 //   System.out.println("child method");  
 // }    
    
  public static void main(String args[]) {    
   Parent12 p = new TestExceptionChild2();    
     
   try {    
   p.msg();    
   }  
   catch (Exception e){}   
  
  }    
}     
