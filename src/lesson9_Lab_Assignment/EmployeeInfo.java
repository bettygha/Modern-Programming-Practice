package lesson9_Lab_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List <Employee> emps,  SortMethod method) {

		class EmployeeComparator implements Comparator<Employee> {

     //SortMethod method argument is outside 
     //of the EmployeeComparator class (JL).

			@Override  //Comparator is now aware of sort method

			public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {  //  free variable 
					return e1.getName().compareTo(e2.getName());
				} else {
					if(e1.getSalary() == e2.getSalary()) return 0;
					else if(e1.getSalary() < e2.getSalary()) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	public static void main(String[] args) {
		List<Employee>emps = new  ArrayList<>();
		emps.add(new Employee("Joe", null, 100000, null));
		emps.add(new Employee("Tim", null, 50000, null));
		emps.add(new Employee("Andy", null, 60000, null));

		EmployeeInfo  ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}

