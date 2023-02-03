package lesson1_lab_1;

import java.util.ArrayList;
import java.util.List;

public class Faculty  extends Person{

	private double salary ;
	List<Course> courses;
	
	
	
	public Faculty(String nameString, String phoneNumberString, int age,double salary,DemoEnum demoEnum ) {
		super(nameString, phoneNumberString, age, demoEnum);
		this.salary = salary ;
		courses = new ArrayList<>();
	}
	
	
	
	public int getTotalUnits() {
		int result = 0;
		/*
		 * for(int i = 0 ; i < courses.size() ;i++) { result+=
		 * courses.get(i).getUnits(); } return result;
		 */

		// int result = courses.stream().mapToInt(Course::getUnits).sum();

		result = courses.stream().map(c -> c.getUnits()).reduce(0, (x, y) -> x + y);
		return result;

	}
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	@Override
	public double getSalary() {
		return this.salary;
	}


	public List<Course> getCourses() {
		return courses;
	}


	
	
}
