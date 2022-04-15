package com.javatpoint.exception;

import java.io.*;    
class Parent11{    
  void msg() {  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild1 extends Parent11{    
  void msg()throws ArithmeticException {    
    System.out.println("child method");    
  }    
  
  public static void main(String args[]) {    
   Parent11 p = new TestExceptionChild1();    
   p.msg();    
  }    
}   