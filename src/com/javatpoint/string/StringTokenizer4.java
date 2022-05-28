package com.javatpoint.string;

import java.util.StringTokenizer;    
public class StringTokenizer4 
{    
 /* Driver Code */  
 public static void main(String args[])  
 {    
   /* StringTokenizer object */  
   StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");    
         /* Prints the number of tokens present in the String */  
         System.out.println("Total number of Tokens: "+st.countTokens());    
 }    
}  