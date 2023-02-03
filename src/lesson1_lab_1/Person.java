package lesson1_lab_1;

public class Person  implements IPerson{
	
	protected String nameString ;
	protected String phoneNumberString;
	protected int age ;
	

	DemoEnum demoEnum;
	public Person(String nameString, String phoneNumberString, int age,DemoEnum demoEnum) {
		
		this.nameString = nameString;
		this.phoneNumberString = phoneNumberString;
		this.age = age;
		setSex(demoEnum);
		
	}
	public double getSalary() {
		return 0;
	}
	@Override
	public void myAbstract() {
		IPerson.myStatic();

	}
	public void setSex(DemoEnum demoEnum) {
		this.demoEnum = demoEnum;
		
	}
	
	

}
