package com.javatpoint.thiskeyword;

class Student8{  
int rollno;  
String name,course;  
float fee;  
Student8(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student8(int rollno,String name,String course,float fee){  
this.fee=fee;  
//this(rollno,name,course);//C.T.Error  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis8{  
public static void main(String args[]){  
Student8 s1=new Student8(111,"ankit","java");  
Student8 s2=new Student8(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  