package com.javatpoint.thiskeyword;

class A5{  
A5(){System.out.println("hello a");}  
A5(int x){  
this();  
System.out.println(x);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
A5 a=new A5(10);  
}}  