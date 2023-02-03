package lesson9_StreamExcersice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lesson1_Design_2.ItemCopy;
import lesson9_Lab_Assignment.Employee;

public class Sort {

	public static void main(String[] args) {
		List<String> nameStrings = new ArrayList<>() {{
			add("Abebe");
			add("Kebede");
			add("Almaz");
			add("Burtikan");
		};
			  
		};
		nameStrings.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		
		
		List<Employee> list = new ArrayList<>() {{
			
			add(new Employee("Abebe", "Kebede", 150.0, "IT"));
			add(new Employee("Almaz", "Ayele", 103.0, "IT"));
			add(new Employee("Alemtsehay", "Ayenat", 210.0, "IT"));
			add(new Employee("Burtikan", "Tesfaye", 19.0, "IT"));

		};
			
		};
		
		list.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.forEach(System.out::println);
		
		list.stream().sorted(Comparator.comparingInt(e -> ((Employee) e).getFirstName().length())
				  .thenComparingInt(e -> ((Employee) e).getLastName().length()))
	 .forEach(e -> System.out.println(e));
		
		// 
		Function<Employee, Integer> byFirstLengthFunction = e->e.getFirstName().length();
		Function<Employee, Integer> byLastLengthFunction = e->e.getLastName().length();
		
		list.stream().sorted(Comparator.comparing(byFirstLengthFunction).thenComparing(byLastLengthFunction)).forEach(System.out::println);
		
		
		Function<Employee, Double> bysalary = e->e.getSalary();
		Function<Employee,String> byName = e->e.getName();
		
		list.stream().sorted(Comparator.comparing(bysalary).thenComparing(byName)).forEach(System.out::println);
		
		list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getLastName)).forEach(System.out::println);
		
		

		
	}
}
