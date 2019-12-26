package com.prac;

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter int value");
		int i = s.nextInt();
		System.out.println("Enter double value");
		double d = s.nextDouble();
		System.out.println("Enter string value");
		String a = s.nextLine();
		System.out.println("Enter string value");
		String b = s.next();
		System.out.println("integer value : "+i+" ,Double value : "+d+" ,String value :"+b);
		
	}

}
