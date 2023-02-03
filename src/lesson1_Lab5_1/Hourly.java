package lesson1_Lab5_1;

import java.time.LocalDate;

public class Hourly  extends Employee{

	private double hourlyWage;
	private double hoursPerWeek;
	
	
	public Hourly(String employeeIdString, double hourlyWage, double hoursPerWeek) {
		super(employeeIdString);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}


	@Override
	
 public double calGrossPay(DateRange date) {
		
		return hourlyWage * hoursPerWeek * 4;
	}
	
}
