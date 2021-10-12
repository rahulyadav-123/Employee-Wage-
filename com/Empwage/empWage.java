package com.Empwage;

public class empWage {
	public static void main(String[] args) {
		int empHour;
		final int full_time = 1;
		final int part_time = 2;
		int total_salary = 0;
		int working_days = 20;
		int empRateprHr = 20;
		int f = 0;
		int p = 0;
		int s = 0;
		for(int i=0; i<=working_days; i++){
			
			int empcheck = (int) Math.floor(Math.random()*3);

			switch(empcheck) {
				case full_time:
					empHour = 8;
					f++;
					break;
				case part_time:
					empHour = 4;
					p++;
					break;
				default:
					empHour = 0;
					s++;
			}
			
			int salary = empRateprHr*empHour;
			
			total_salary += salary;
		}
	
		System.out.println(f + " " + p + " " + s);
		System.out.println("Monthly salary of employee is " + total_salary);
		
	}

	



	}

