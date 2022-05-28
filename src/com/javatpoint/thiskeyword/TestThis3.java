package com.javatpoint.thiskeyword;

class Student5{  
int rollno;  
String name;  
float fee;  
Student5(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis3{  
public static void main(String args[]){  
Student5 s1=new Student5(111,"ankit",5000f);  
Student5 s2=new Student5(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  