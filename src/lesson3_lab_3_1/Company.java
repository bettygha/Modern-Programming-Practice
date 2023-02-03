package lesson3_lab_3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String nameString;

	List<Department> departments;

	public Company(String nameString) {

		this.nameString = nameString;
		departments = new ArrayList<>();
	}

	public String getNameString() {
		return nameString;
	}

	public void print() {
		System.out.println("Company : " + this.nameString);

		/*
		 * for(Department department : departments) { System.out.println(" ");
		 * department.print(); }
		 */

		departments.stream().forEach(department -> {
			System.out.println(" ");
			department.print();
		});

	}

	public void addDepartment(Department department) {
		departments.add(department);

	}

	public int getSlary() {

		int result = 0;
		/*
		 * for(Department department : departments) { result += department.getSlary(); }
		 */

		result = departments.stream().map(department -> department.getSlary()).reduce(0, (x, y) -> x + y);

		return result;
	}

	public void getTopExecutive() {

	}

	public void getDepartmentHead() {

	}

}
