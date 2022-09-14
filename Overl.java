package com.exception;

public class Overl {
void eat(Object a) {
	System.out.println("hello1");
}
void eat(String a) {
	System.out.println("hello");
	
}
public static void main(String[] args) {
	Overl obj=new Overl();
	obj.eat(null);
	//obj.eat("1");
	
}
}
