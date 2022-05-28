package com.javatpoint.thiskeyword;

class A28{  
void m(){  
System.out.println(this);//prints same reference ID  
}  
public static void main(String args[]){  
A28 obj=new A28();  
System.out.println(obj);//prints the reference ID  
obj.m();  
}  
}  
