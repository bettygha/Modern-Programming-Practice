package lesson9_Lab_Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		System.out.println("-------------------1----------------------");

		// 1) Count the number of last names that begin with the letter ‘B’. Print out
		// this number.
		List<Employee> employees2 = Arrays.asList(employees);

		long countLastName = employees2.stream().filter(e -> e.getLastName().startsWith("B")).count();
		System.out.println("Last name that starts with 'B' letter: " + countLastName);

		System.out.println("-------------------2----------------------");

		// 2) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ in sorted order.
		employees2.stream().filter(e -> e.getLastName().startsWith("B"))
				.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.forEach(System.out::println);

		System.out.println("-------------------3----------------------");

		// 3) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ and change their first name and last name to be All capital
		// letters.
		employees2.stream().filter(e -> e.getLastName().startsWith("B"))
				.map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(),
						e.getDepartment()))
				.forEach(System.out::println);

		System.out.println("-------------------4----------------------");

		// 4) Print out All of the employee objects, but if the last name begins with
		// the letter ‘B’, then capitalize all the letters in the last name.

		employees2.stream()
				.map(e -> e.getLastName().startsWith("B")
						? new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(),
								e.getDepartment())
						: e)
				.forEach(System.out::println);
		;

		System.out.println("-------------------4.1----------------------");

		// 4.1) Use the Collectors.joining method to print out All Employee objects

		String lastNameB2 = employees2.stream().map(e -> e.toString()).collect(Collectors.joining(" ; "));

		System.out.println(lastNameB2);

		System.out.println("-------------------4.2----------------------");

		// 4.2 ) ) Use the Collectors.joining method to print out All Employee objects,
		// and separate each one with a delimeter of “---\n---“.

		String lastNameB3 = employees2.stream().map(Employee::toString).collect(Collectors.joining("\n"));

		System.out.println(lastNameB3);

		System.out.println("-------------------5----------------------");

		// 5)Print out all of the Employee objects’ last names, whose last name begins
		// with the letter ‘I’ in sorted order, and get rid of all the duplicates. Print
		// out only the last names.

		employees2.stream().filter(e -> e.getLastName().startsWith("I")).map(e -> e.getLastName()).distinct().sorted()
				.forEach(System.out::println);

		System.out.println("-------------------6----------------------");

		// 6)Print out the average of all the salaries.

		double average = employees2.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		// double average2 = employees2.stream().mapToDouble(e ->
		// e.getSalary()).average().orElse(0);
		System.out.println(average + "\n");

		System.out.println("-------------------7----------------------");

		// 7) Use the ‘reduce’ method to print out the total salary of all employees.

		double total = employees2.stream().map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);

		double total2 = employees2.stream().mapToDouble(Employee::getSalary).reduce(0, Double::sum);

		System.out.println(total + "\n");

		System.out.println("-------------------8----------------------");

		// 8 )Print out only the first names of all the employees. Use the ‘map’ method
		// to accomplish this.

		String firstNameString = employees2.stream().map(e -> e.getFirstName()).collect(Collectors.joining(" , "));
		System.out.println(firstNameString + "\n");

		System.out.println("-------------------9----------------------");

		// 9) Create an infinite stream of even numbers (0, 2, 4, …) and then,
		// eventually print out only the first 20 even numbers from this stream

		Stream.iterate(0, x -> x + 2).limit(20).forEach(System.out::println);

		System.out.println("-------------------C----------------------");
		
		// 1.Find First 
		
		Optional<Employee> findFirst = employees2.stream().
				findFirst();
		
		if( findFirst.isPresent())System.out.println(findFirst.get().toString());
		
		else {
			System.out.println("None");
		}
		
		// 2. FindAny 
		
		Optional<String> findAny = Optional.ofNullable(employees2.stream().map(Employee::getName).findAny().orElse("None"));
		
		findAny.ifPresent(x->System.out.println(x));
		
		
		
		
		
		System.out.println("\n \n");
		
		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// Predicate (boolean-valued function) that returns true for salaries
		// in the range $4000-$6000
		Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

		// Display Employees with salaries in the range $4000-$6000
		// sorted into ascending order by salary
		System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");

		list.stream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		// Display first Employee with salary in the range $4000-$6000
		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
				list.stream().filter(fourToSixThousand).findFirst().get());

		// Functions for getting first and last names from an Employee
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;

		// Comparator for comparing Employees by first name then last name
		Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

		// sort employees by last name, then first name
		System.out.printf("%nEmployees in ascending order by last name then first:%n");
		list.stream().sorted(lastThenFirst).forEach(System.out::println);

		// sort employees in descending order by last name, then first name
		System.out.printf("%nEmployees in descending order by last name then first:%n");
		list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);

		// display unique employee last names sorted
		System.out.printf("%nUnique employee last names:%n");
		list.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);

		// display only first and last names
		System.out.printf("%nEmployee names in order by last name then first name:%n");
		list.stream().sorted(lastThenFirst).map(Employee::getName).forEach(System.out::println);

		// group Employees by department
		System.out.printf("%nEmployees by department:%n");
		Map<String, List<Employee>> groupedByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		groupedByDepartment.forEach((department, employeesInDepartment) -> {
			System.out.println(department);
			employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
		});
		System.out.println("");
		// each department with average salary
		Map<String, List<Employee>> departmentAverageSalary = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println("Each department with their average salary \n");
		departmentAverageSalary.forEach((department, employeeInDepartment) -> {

			System.out.print(department);
			System.out.println(
					" : " + employeeInDepartment.stream().mapToDouble(Employee::getSalary).average().orElse(0) + " ");
		});
		System.out.println("");

		// each department it's maximus salary
		Map<String, List<Employee>> departmentHighestSalary = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Each department with their maximum salary \n");
		departmentHighestSalary.forEach((depatment, employeeInDepartment) -> {

			System.out.print(depatment);
			System.out.println(" : " + employeeInDepartment.stream().mapToDouble(Employee::getSalary).max().orElse(0));
		});

		// count number of Employees in each department
		System.out.printf("%nCount of Employees by department:%n");

		Map<String, Long> employeeCountByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));

		employeeCountByDepartment
				.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));

		;
		/*
		 * Output looks something like :
		 * 
		 * HR 4 IT 8 Sales 12
		 */

		// sum of Employee salaries with DoubleStream sum method
		/*
		 * System.out.printf("%nSum of Employees' salaries (via sum method): %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).sum());
		 * 
		 * // calculate sum of Employee salaries with Stream reduce method
		 * System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) ->
		 * value1 + value2));
		 * 
		 * // average of Employee salaries with DoubleStream average method
		 * System.out.printf("Average of Employees' salaries: %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
		 */
	} // end main
} // end class ProcessingEmployees

/*********************************************************************************************************************************
 * 
 * TEACH THE
 * 
 * PEEK() METHOD
 * 
 * This method exists mainly to support debugging, where you want to see the
 * elements as they flow past a certain point in a pipeline:
 * 
 * Stream.of("one", "two", "three", "four") .filter(e -> e.length() > 3) .peek(e
 * -> System.out.println("Filtered value: " + e)) .map(String::toUpperCase)
 * .peek(e -> System.out.println("Mapped value: " + e))
 * .collect(Collectors.toList());
 */
