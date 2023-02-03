package lesson1_Lab5_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	public static void main(String[] args) {
		Employee employee= new Hourly("12A",17.0,80);
		Employee employee2 = new Salaried("13A", 2000.00);
		
		List<Order> orders = new ArrayList<>();
		Order orderOne = new Order("1",LocalDate.now() , 10);
		Order orderTwo = new Order("3",LocalDate.now().plusDays(2), 20);
		
		orders.add(orderOne);
		orders.add(orderTwo);
		
		Employee employee3 = new Commissioned("4A", 2, 1000, orders);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		for(Employee employee4 : employees) {
			employee4.calComponsation(2, 1999);
			employee4.print();
		}
		
		
		
	}

}
