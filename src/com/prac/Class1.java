package com.prac;

public class Class1 {
	
	public void method()
	{
		System.out.println("mani");
	}

	public void method(int a)
	{
		System.out.println(a);
	}
	public void method(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Class1 c = new Class1();
		c.method();
		c.method(10);
		c.method("manikandan");
	}
}
