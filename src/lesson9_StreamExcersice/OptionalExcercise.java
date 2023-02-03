package lesson9_StreamExcersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lesson9_Lab_Assignment.Employee;
import lesson9_Lab_Assignment.ExamDate;

public class OptionalExcercise {
	public static void main(String[] args) {
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };



		Optional<String> res = Arrays.stream(employees).map(e->e.getFirstName()).max(String::compareToIgnoreCase);
		
		// Several options available to check optional result without Null exception 
		
		//1. isPresent
		
		if(res.isPresent()) System.out.println(res.get());
		else {
			System.out.println("No Max");
		}
		
		//2. ifPresent
		
		res.ifPresent(x->System.out.println(x));// if data available will print other wise nothing will print 
		
		//3. orElse 
		
		System.out.println(res.orElse("No Max"));
		
		//4. findFirst  suitable for the single stream 
		
		Optional<String> res2 = Arrays.stream(employees).
				map(e->e.getFirstName()).findFirst();
		
		System.out.println(res2.orElse("No name"));
		
		// 5. findAny suitable for the parallel stream 
		Optional<Double> res3 = Arrays.stream(employees).map(Employee::getSalary).findAny();
		
		System.out.println(res3.orElse(0.0));
		
		//// 
		
		Optional<String> fullnameOptional = Optional.of("Abebe Kebede");
		//fullnameOptional = Optional.empty();
		fullnameOptional = null;
		
		//System.out.println(fullnameOptional.orElseGet(()-> "None"));
		System.out.println(fullnameOptional.ofNullable("Null"));
		
		Optional<Double> res4 = inverse(2.0);
		System.out.println(res4.orElse(0.0));
		
		
				
		
		
		
	}

	// Creating my own optional 
	public static Optional<Double> inverse(Double x) {
		return x== null || x== 0 ? Optional.empty() : Optional.of(1/x);
		
		
	}

}
