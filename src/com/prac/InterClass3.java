package com.prac;

public class InterClass3 implements InterClass1,InterClass2 {


	@Override
	public void method1() {
		
		System.out.println("mani");
			}

	@Override
	public void method2() {
		System.out.println("kandan");
		 
	}

	@Override
	public void method3() {
		System.out.println("raja");
	
	}
	public static void main(String[] args) {
		InterClass3 i= new InterClass3();
		i.method1();
		i.method2();
		i.method3();
		
	}
	
}

		
