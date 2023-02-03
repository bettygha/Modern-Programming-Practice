package lesson1_lab_1;

import java.time.LocalDate;

public class StaffStudent extends Staff {

	Student student;
	LocalDate localDate;

	public StaffStudent(String nameString, String phoneNumberString, int age, double salary, double GPA,DemoEnum demoEnum) {
		super(nameString, phoneNumberString, age, salary, demoEnum);
		student = new Student(nameString, phoneNumberString, age, GPA, demoEnum);

	}

	@Override
	public double getSalary() {
		return this.getSalary();
	}

	public void addCourse(Course course) {
		if (student.getStudentCourses().isEmpty()) {
			localDate = LocalDate.now();
		}
		student.addCourse(course);

	}

	public int getTotalUnits() {
		int result = 0;
	/*	for (int i = 0; i < student.studentCourses.size(); i++) {
			result += student.studentCourses.get(i).getUnits();

		}
		return result; */
		
		result = student.studentCourses.stream().mapToInt(Course::getUnits).sum();
		return result;

	}

}
