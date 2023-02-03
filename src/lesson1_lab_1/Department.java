package lesson1_lab_1;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Department {

	private String nameString;
	List<Person> persons;

	public Department(String nameString) {

		this.nameString = nameString;
		persons = new ArrayList<>();

	}

	// using instance of
	/*
	 * public double getTotalSalary() { double result = 0; for(Person person :
	 * persons) { if(person instanceof Faculty) { Faculty faculty = (Faculty)person;
	 * result+= faculty.getSalary(); } if(person instanceof Staff) { Staff staff =
	 * (Staff) person; result+= staff.getSalary(); } } }
	 */

	// using polymorphism
	public double getTotalSalary() {
		double result = 0;
		/*
		for (int i = 0; i < persons.size(); i++) {
			result += persons.get(i).getSalary();
		}
		*/
		result = persons.stream().map(person->person.getSalary()).reduce(0.0, (x,y)->x+y);
		return result;

	}

	public void showAllMembers() {
		
	/*	for (Person person : persons) {
			System.out.printf("%s , %s , %d%n ", person.nameString, person.phoneNumberString, person.age);
		} */
		
		persons.stream().forEach(person-> {
			System.out.printf("%s , %s , %d%n ", person.nameString, person.phoneNumberString, person.age);
		});

	}

	public void unitsPerFaculty() {

		/*
		 * for (int i = 0; i < persons.size(); i++) {
		 * 
		 * if (persons.get(i).getClass().getSimpleName().equals("Faculty")) { Faculty
		 * faculty = (Faculty) persons.get(i); System.out.println("Faculty name: " +
		 * persons.get(i).nameString + "Unit: " + faculty.getTotalUnits()); } }
		 */

		persons.stream().filter(p -> p.getClass().getSimpleName().equals("Faculty")).map(p -> (Faculty) p)
				.forEach(f -> System.out.println("Faculty name: " + f.nameString + "Unit: " + f.getTotalUnits()));

	}

	public void addPerson(Person person) {
		persons.add(person);

	}

	public HashSet<String> getfacultyStudents(String facultyName) {
		HashSet<String> studentsNameHashSet = new HashSet<>();
		
	/*	for (Person person : persons) {
			if (person.nameString.equals(facultyName) && person instanceof Faculty) {
				Faculty faculty = (Faculty) person;
				for (Course course : faculty.getCourses()) {
					for (Person person2 : persons) {
						if (person2 instanceof Student) {
							Student student = (Student) person2;
							for (Course course2 : student.getStudentCourses()) {
								if (course.equals(course2)) {
									if (!studentsNameHashSet.contains(student.nameString)) {
										studentsNameHashSet.add(student.nameString);

									}

								}
							}
						}
					}

				}
			}

		} */
	studentsNameHashSet = persons.stream().filter(p -> p.nameString.equals(facultyName) && p instanceof Faculty)
			.map(p -> (Faculty) p)
			.flatMap(f -> f.getCourses().stream()
					.flatMap(c -> persons.stream().filter(p -> p instanceof Student).map(p -> (Student) p)
							.filter(s -> s.getStudentCourses().contains(c)).map(s -> s.nameString).distinct()))
			.collect(Collectors.toCollection(HashSet::new));
		
		
		return studentsNameHashSet;

	}

}
