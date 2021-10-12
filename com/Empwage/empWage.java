package com.Empwage;

public class empWage {
	public static void main(String[] args) {
		
		final int EMP_CHECK = 1;
		double random_val = Math.random()*10;
		double empcheck = Math.floor(random_val) % 2;

		System.out.println("The random value generated for employee check is " + random_val);

		//Condition statement
		if(EMP_CHECK == empcheck){
			int empRateprHr = 20;
			int empHour = 8;
			int salary = empRateprHr*empHour;
			System.out.println("Employee per day salary is " + salary);
		}
		else{
			int salary = 0;
			System.out.println("Employee is Absent, so salary is " + salary);
		}
	}


}
