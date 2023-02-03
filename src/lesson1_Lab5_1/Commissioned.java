package lesson1_Lab5_1;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {

	private double commission = 0.7 ;
	private double baseSalary;
	
	List<Order>orders ;
	
	
	
	public Commissioned(String employeeIdString, double commission, double baseSalary, List<Order> orders) {
		super(employeeIdString);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}



	@Override
	public double calGrossPay(DateRange date) {
		// TODO Auto-generated method stub
		double amount = 0;
		for(Order order : orders) {
			amount+= order.getOrderAmount();

		}
		return  baseSalary +( amount * commission);
	}

}
