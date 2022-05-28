package com.javatpoint.javamethod;

abstract class Demo2 //abstract class  
{  
//abstract method declaration  
abstract void display();  
}  
public class MyClass extends Demo2  
{  
//method impelmentation  
void display()  
{  
System.out.println("Abstract method?");  
}  
public static void main(String args[])  
{  
//creating object of abstract class  
Demo2 obj = new MyClass();  
//invoking abstract method  
obj.display();  
}  
}  