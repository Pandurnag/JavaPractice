package com.javatpoint.string;

class StringBuilderExample4{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.delete(1,2);  
System.out.println(sb);//prints Hlo  
}  
}  
