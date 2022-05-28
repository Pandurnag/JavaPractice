package com.javatpoint.string;

class StringBuilderExample3{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.replace(1,2,"Java");  
System.out.println(sb);//prints HJavalo  
}  
}  
