package com.exception;

public class Two {

	public static void main(String[] args) {      
	    
	    int age=25;    
	    int weight=48;      
	       
	    if(age>=18){      
	        if(weight>=48){    
	            System.out.println("You are eligible to donate blood");    
	        } 
	        else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    }
	    else{  
	      System.out.println("Age must be greater than 18");  
	    }  
	} 
	
}
