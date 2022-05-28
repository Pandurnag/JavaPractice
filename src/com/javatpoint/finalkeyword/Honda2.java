package com.javatpoint.finalkeyword;

class Bike6{  
	  final void run(){System.out.println("running...");}  
	}  
	class Honda2 extends Bike6{  
	   public static void main(String args[]){  
	    new Honda2().run();  
	   }  
	}  
