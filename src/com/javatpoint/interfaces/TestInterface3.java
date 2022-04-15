package com.javatpoint.interfaces;

interface Printable2{  
void print();  
}  
interface Showable1{  
void print();  
}  
  
class TestInterface3 implements Printable2, Showable1{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
TestInterface3 obj = new TestInterface3();  
obj.print();  
 }  
}  