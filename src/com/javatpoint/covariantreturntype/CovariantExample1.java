package com.javatpoint.covariantreturntype;

class A5  
{  
    A5 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A5");  
    }  
}  
  
  
// A2 is the child class of A5  
class A6 extends A5  
{  
    @Override  
    A6 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A6");  
    }  
}  
  
// A7 is the child class of A6  
class A7 extends A6  
{  
    @Override  
    A7 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A7");  
    }  
}  
  
public class CovariantExample1  
{  
    // main method  
    public static void main(String argvs[])  
    {  
       A5 a5 = new A5();  
         
       a5.foo().print();  
         
       A6 a6 = new A6();  
         
       a6.foo().print();  
         
       A7 a7 = new A7();  
         
       a7.foo().print();  
         
    }  
}  
