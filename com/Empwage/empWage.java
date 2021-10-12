package com.Empwage;

public class empWage {
	public static void main(String[] args) {
		int empHour;
		final int full_time = 1;
		final int part_time = 2;
		int empRateprHr = 20;
		
		int empcheck = (int) Math.floor(Math.random()*3);

		if(empcheck == full_time) {
			empHour = 10;
		}
		else if(empcheck == part_time){
			empHour = 8;
		}
		else{
			empHour = 0;
		}
		
		int salary = empRateprHr*empHour;
		System.out.println("The salary of employee is " + salary);
	}


}


	

	