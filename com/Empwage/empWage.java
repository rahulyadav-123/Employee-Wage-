package com.Empwage;

public class empWage {
	public static void main(String[] args) {
		  // Constants

        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;

        // Initializing variables
        int EmpWage = 0, empHrs = 0;

        // Computations
        double empCheck = Math.floor(Math.random() * 10) % 3;

          if(empCheck == IS_FULL_TIME) {
                    empHrs = 8;
                 }
               else if(empCheck == IS_PART_TIME) {
                    empHrs = 4;
                 }
               else {
                    empHrs = 0;
                 }
                  EmpWage = empHrs * EMP_RATE_PER_HOUR;
           System.out.println("To Calculate Dailly Employee Wage: "+EmpWage);
      }

	}
	

