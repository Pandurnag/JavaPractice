package com.javatpoint.exception;

import java.io.*;    
class Parent15{    
  void msg()throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild4 extends Parent15{    
  void msg()throws ArithmeticException {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent15 p = new TestExceptionChild4();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}    
