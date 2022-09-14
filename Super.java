package com.exception;

public class Super {
int a=200;
}
class Uper extends Super{
	int a=100;
	void eat() {
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Uper obj=new Uper();
		obj.eat();
	}
	
}
