package com.javatpoint.thiskeyword;

class Student2{  
int rollno;  
String name;  
float fee;  
Student2(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student2 s1=new Student2(111,"ankit",5000f);  
Student2 s2=new Student2(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  