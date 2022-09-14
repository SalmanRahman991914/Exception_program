package com.exception;

public class Throw_exception {
public static void validate(int age) {
	if(age<18){
		 throw new ArithmeticException("person is note eligible to vote");
	}
	else {
		System.out.println("person is elidible to vote");
		
	}	
	}
public static void main(String[] args) {
	validate(15);
	System.out.println("rest of the code");
}
}

