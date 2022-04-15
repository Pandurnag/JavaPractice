package com.javatpoint.polymorphism;

class Animal2{  
void eat(){System.out.println("animal is eating...");}  
}  
class Dog2 extends Animal2{  
void eat(){System.out.println("dog is eating...");}  
}  
class BabyDog1 extends Dog{  
public static void main(String args[]){  
BabyDog1 a=new BabyDog1();  
a.eat();  
}}  
