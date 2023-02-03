package lesson1_Lab5_1;

import java.time.LocalDate;
import java.util.zip.DataFormatException;

public class Salaried  extends Employee{
	private double salary;

	
	
	public Salaried(String employeeIdString, double salary) {
		super(employeeIdString);
		this.salary = salary;
	}



	@Override
public 	double calGrossPay(DateRange date) {
		
		// TODO Auto-generated method stub
		return salary;
	}
	

}
