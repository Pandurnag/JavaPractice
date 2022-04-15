package com.javatpoint.accessmodifier;

class A1{  
A1(){}//private constructor  
void msg(){System.out.println("Hello java");}  
//}  
//public class Simple{  
 public static void main(String args[]){  
   A1 obj=new A1();//Compile Time Error  
 }  
}  