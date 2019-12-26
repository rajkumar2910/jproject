package com.prac;

public class Employee extends Vehicles {

	public void empId()
	{
		System.out.println("123");
	}
	public void empName()
	{
		System.out.println("Manikandan");
	}
	
	public static void main(String[] args) {
	
		Employee e = new Employee();
		e.cars();
		e.bikes();
		e.empId();
		e.empName();
		e.diesel();
		
		
	}
}
