package com.javatpoint.string;

import java.util.*;  

public class Test {  
   public static void main(String[] args) {  
       StringTokenizer st = new StringTokenizer("name is,khan");  
        
      // printing next token  
      System.out.println("Next token is : " + st.nextToken(","));  
   }      
}  
