package com.exception;

public abstract  class Hello {
abstract void eat();
	}
 class A extends Hello{
	void eat() {
		System.out.println("hello abstract class....");
	}
 }
 class B extends Hello{
	 void eat() {
		 System.out.println("hello abstract Child class....... ");
 }
 }
 class C{
	public static void main(String[] args) {
	A obj=new A();
	obj.eat();
	
}
 }
	