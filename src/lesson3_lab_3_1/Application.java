package lesson3_lab_3_1;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Company company = new Company("CAT Constraction P.L.C");

		Department departmentOne = new Department("Finance", "Megenagna");
		Department departmentTwo = new Department("Managment", "Ayer Tena");
		Department departmentOneCopy = new Department("Finance", "Megenagna");

		company.addDepartment(departmentOne);
		company.addDepartment(departmentTwo);

		Employee employeeOne = new Employee("12A", "Abebe", "B", "Kebede", "12-23-1989", "123-77-3211", 5000);
		Employee employeeTwo = new Employee("13A", "Burtikan", "C", "Teferi", "13-01-1990", "124-33-0987", 4000);
		Employee employeeOneCopy = new Employee("12A", "Abebe", "B", "Kebede", "12-23-1989", "123-77-3211", 5000);

		List<Employee> employeesOne = new ArrayList<>();
		employeesOne.add(employeeOne);
		employeesOne.add(employeeTwo);

		Employee employeeThree = new Employee("12A", "Almaz", "B", "Tataek", "12-23-1989", "123-77-3211", 5000);
		Employee employeeFour = new Employee("13A", "Flower", "C", "Cute", "13-01-1990", "124-33-0987", 4000);
		List<Employee> employeesTwo = new ArrayList<>();
		employeesTwo.add(employeeThree);
		employeesTwo.add(employeeFour);

		Employee employeeFive = new Employee("12A", "Azeb", "B", "Gebre", "12-23-1989", "123-77-3211", 5000);
		Employee employeeSix = new Employee("13A", "Samri", "C", "Gebre", "13-01-1990", "124-33-0987", 4000);
		List<Employee> employeesThree = new ArrayList<>();
		employeesThree.add(employeeFive);
		employeesThree.add(employeeSix);

		Position positionOne = new Position("Secretary", "Maintain and organize office tasks", employeeOne);
		Position positionTwo = new Position("Manager", "Organisation and manages a team of employees", employeeTwo);
		Position positionThree = new Position("Accountant", "Keeping and interpreting financial records.",
				employeeThree);
		Position positionThreeCopy = new Position("Accountant", "Keeping and interpreting financial records.",
				employeeThree);

		departmentOne.addPosition(positionOne);
		departmentOne.addPosition(positionTwo);
		departmentOne.addPosition(positionThree);

		departmentOneCopy.addPosition(positionOne);
		departmentOneCopy.addPosition(positionTwo);
		departmentOneCopy.addPosition(positionThree);

		company.print();
		System.out.println(
				"Total salary company " + company.getNameString() + " Pay to it's employees is " + company.getSlary());

		//////////////////////////////////////

		List<Position> inferiorListPositionOne = new ArrayList<>();
		inferiorListPositionOne.add(positionOne);

		List<Position> inferiorListPositionTwo = new ArrayList<>();
		inferiorListPositionTwo.add(positionThree);

		positionTwo.setInferiors(inferiorListPositionOne);
		positionOne.setInferiors(inferiorListPositionTwo);
		System.out.println(" ");
		System.out.println("****************  Inferior Positions **********");
		positionTwo.printDownLine(0);

		// Equal Employee
		System.out.println("UnEqual Employee:" + employeeOne.equals(employeeOneCopy) +" Equal HashCode: " + (employeeOne.hashCode() == employeeOneCopy.hashCode()) );

		// Unequal employee
		System.out.println("Unequal Employee: " + employeeOne.equals(employeeTwo) + "UnEqual HashCode: "+ (employeeOne.hashCode() == employeeTwo.hashCode()));
		System.out.println("");

		// Equal Position
		System.out.println("Equal Position: " + positionThree.equals(positionThreeCopy) +" Equal HashCode: " +(positionThree.hashCode() == positionThreeCopy.hashCode()));
		// UnEqual Position
		System.out.println("UnEqual Position: " + positionOne.equals(positionThreeCopy) + "UnEqual HashCode: "+ (positionOne.hashCode() == positionThreeCopy.hashCode()));
		System.out.println(" ");

		// Equal Department
		System.out.println("Equal Department: " + departmentOne.equals(departmentOneCopy) +" Equal HashCode: " + (departmentOne.hashCode() == departmentOneCopy.hashCode()));

		// Unequal Department
		System.out.println("UnEqual Department: " + departmentOne.equals(departmentTwo) + "UnEqual HashCode: "+ (departmentOne.hashCode() == departmentTwo.hashCode()) );
		System.out.println(" ");
		
		//ToString in Employee
		System.out.println(employeeOne.toString()+ "\n");
		
		//ToString in Position 
		System.out.println(positionOne.toString()+ "\n");
		
		//ToString in Departmemnt
		System.out.println(departmentOne.toString() + "\n");
		
		//Cloned 
		try {
			Employee clonedEmployee = (Employee) employeeOne.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
