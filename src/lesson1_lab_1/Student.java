package lesson1_lab_1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private double GPA;
	List<Course> studentCourses;
	
	
	
	public Student(String nameString, String phoneNumberString, int age,double GPA,DemoEnum demoEnum) {
		super(nameString, phoneNumberString, age, demoEnum);
		this.GPA = GPA ;
		studentCourses = new ArrayList<>();	
		
	}

	public int getTotalUnits() {
		int result = 0;
	/*	for(int i = 0 ; i < studentCourses.size() ;i++) {
			result+= studentCourses.get(i).getUnits(); 
		}
		return result; */
		
		result = studentCourses.stream().mapToInt(Course::getUnits).sum();
		return result;
		
	}
	
	public void addCourse(Course course) {
		studentCourses.add(course);
	}

	public List<Course> getStudentCourses() {
		return studentCourses;
	}
}
