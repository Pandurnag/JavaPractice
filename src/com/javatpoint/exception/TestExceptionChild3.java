package com.javatpoint.exception;

import java.io.*;    
class Parent14{    
  void msg() throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
public class TestExceptionChild3 extends Parent14 {    
  void msg()throws Exception {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent14 p = new TestExceptionChild3();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}    