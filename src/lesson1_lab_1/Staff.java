package lesson1_lab_1;

public class Staff  extends Person{

	private double salary ;
	
	
	public Staff(String nameString, String phoneNumberString, int age , double salary,DemoEnum demoEnum) {
		super(nameString, phoneNumberString, age, demoEnum);
		this.salary = salary;
	
	}

	@Override
	public double getSalary() {
		return this.salary;
	}
	
}
