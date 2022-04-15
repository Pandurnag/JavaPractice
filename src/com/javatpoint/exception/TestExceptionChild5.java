package com.javatpoint.exception;

import java.io.*;    
class Parent16 {    
  void msg()throws Exception{  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild5 extends Parent16{    
  void msg() {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent16 p = new TestExceptionChild5();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}  
       
  }    
}     
