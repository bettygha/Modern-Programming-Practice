package lesson1_Lab5_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private String employeeIdString;
	
	List<Paycheck> paychecks;
	
	
	
	public Employee(String employeeIdString) {
		
		this.employeeIdString = employeeIdString;
		paychecks = new ArrayList<>();
	}
	public void print() {
		for(Paycheck paycheck2 : paychecks) {
			
			paycheck2.print();
		}
		
		
	}
	public Paycheck calComponsation(int month , int year) {
		
		LocalDate localDate = LocalDate.of(year, month, 1);
		LocalDate localDate2 = LocalDate.of(year, month, 28);
		DateRange dateRange = new DateRange(localDate,localDate2);
		double result = this.calGrossPay(dateRange);
		Paycheck paycheck = new Paycheck(result , dateRange);
		paychecks.add(paycheck);
		
		
		return paycheck;
	}
	abstract public double calGrossPay(DateRange date);

}
