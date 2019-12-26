package com.prac;

public class ExampleOver extends ExampleOverride {
	
	@Override
	public void studentId() {
		
		System.out.println("4321");
	}
	
	@Override
	public void studentName() {
		
		System.out.println("rajkumar");
	}
	
	public static void main(String[] args) {
		
		ExampleOver e = new ExampleOver();
		e.studentId();
		e.studentName();
		
	}

}
