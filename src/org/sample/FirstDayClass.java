package org.sample;

import java.util.Scanner;

public class FirstDayClass {

	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("enter ur id?");
		int id = s.nextInt();
		System.out.println("enter ur name");
		String name = s.next();
		System.out.println("enter ur salary?");
		float salary = s.nextFloat();
		System.out.println("enter ur weight");
		double weight = s.nextDouble();
		System.out.println("enter ur initial?");
		char initial = s.next().charAt(3);
		System.out.println("enter ur phoneno?");
		long phoneno = s.nextLong();
		System.out.println("all above info are true or false?");
		boolean info = s.nextBoolean();
		
		System.out.println("employee details");
		System.out.println("emp id = "+id);
		System.out.println("emp name = "+name);
		System.out.println("emp salary = "+salary);
		System.out.println("emp weight = "+weight);
		System.out.println("emp initial = "+initial);
		System.out.println("emp phno = "+phoneno);
		System.out.println("emp info = "+info);
		
		
	}
}
