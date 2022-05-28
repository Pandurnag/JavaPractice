package com.javatpoint.thiskeyword;

class A11{  
A11 getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
class Test1{  
public static void main(String args[]){  
new A11().getA().msg();  
}  
}  