package com.javatpoint.thiskeyword;

class Student4{  
int rollno;  
String name,course;  
float fee;  
Student4(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student4(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis7{  
public static void main(String args[]){  
Student4 s1=new Student4(111,"ankit","java");  
Student4 s2=new Student4(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  