package lesson9_Lab_Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProcessingEmployeeMine {

	public static void main(String[] args) {

		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees

		List<Employee> listEmployees = Arrays.asList(employees);

		// display all Employees

		System.out.println("Complete Employee list:");
		listEmployees.stream().forEach(System.out::println);

		// Predicate (boolean-valued function) that returns true for salaries
		// in the range $4000-$6000

		Predicate<Employee> fourToSixThousedn = e -> e.getSalary() >= 4000 && e.getSalary() <= 6000;

		// Display Employees with salaries in the range $4000-$6000
		// sorted into ascending order by salary

		listEmployees.stream().filter(fourToSixThousedn).sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		// Display first Employee with salary in the range $4000-$6000

		listEmployees.stream().filter(fourToSixThousedn).findFirst().get();

		// Functions for getting first and last names from an Employee
		Function<Employee, String> firstName = Employee::getFirstName;
		Function<Employee, String> lastName = Employee::getLastName;

		// Comparator for comparing Employees by first name then last name

		Comparator<Employee> lastThenFirst = Comparator.comparing(lastName).thenComparing(firstName);

		// sort employees by last name, then first name

		listEmployees.stream().sorted(lastThenFirst).forEach(System.out::println);

		listEmployees.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);

		// display unique employee last names sorted
		listEmployees.stream().map(e -> e.getLastName()).sorted().distinct().forEach(System.out::println);

		// display only first and last names

		listEmployees.stream().map(e -> e.getName()).sorted().forEach(System.out::println);

		// group Employees by department

		Map<String, List<Employee>> groupByDempartment = listEmployees.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment()));

		groupByDempartment.forEach((department, employeeInDepartment) -> {
			System.out.println(department);
			employeeInDepartment.forEach(e -> System.out.println(e));

		});
		
		// count number of Employees in each department
		groupByDempartment.forEach((department,employeeInDepartment) -> {
			System.out.print(department + " ");
			System.out.println(employeeInDepartment.stream().count());
		});

		Map<String, Long> employeeCountByDepartment = 
				listEmployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(), Collectors.counting()));
		
		
		employeeCountByDepartment.forEach((department,count)->{
			System.out.println(department + "with employee" + count);
			
		});
	}
}
