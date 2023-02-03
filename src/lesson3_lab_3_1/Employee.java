package lesson3_lab_3_1;

import java.util.Objects;

public class Employee {

	private String employeeIdString;
	private String firstNameString;
	private String middleInitialString;
	private String lastNameString;
	private String birthDateString;
	private String SSN;
	private int salary;

	public Employee(String employeeIdString, String firstNameString, String middleInitialString, String lastNameString,
			String birthDateString, String sSN, int salary) {

		this.employeeIdString = employeeIdString;
		this.firstNameString = firstNameString;
		this.middleInitialString = middleInitialString;
		this.lastNameString = lastNameString;
		this.birthDateString = birthDateString;
		SSN = sSN;
		this.salary = salary;
	}

	public void print() {
		System.out.println("ID : " + this.employeeIdString);
		System.out.println("First Name: " + this.firstNameString);
		System.out.println("Middle Inital: " + this.middleInitialString);
		System.out.println("Last Name: " + this.lastNameString);
		System.out.println("BirthDate: " + this.birthDateString);
		System.out.println("SSN: " + this.SSN);
		System.out.println("Salary: " + this.salary);
		System.out.println(" ");

	}

	public int getSlary() {
		return this.salary;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		boolean isEqual = employee.employeeIdString.equals(this.employeeIdString)
				&& employee.firstNameString.equals(this.firstNameString)
				&& employee.middleInitialString.equals(this.middleInitialString)
				&& employee.lastNameString.equals(this.lastNameString)
				&& employee.birthDateString.equals(this.birthDateString) && employee.SSN.equals(this.SSN)
				&& employee.salary == this.salary;
		return isEqual;
	}

	@Override
	public String toString() {

		return "ID : " + this.employeeIdString + " First Name: " + this.firstNameString + " Middle Inital: "
				+ this.middleInitialString + " Last Name: " + this.lastNameString + " BirthDate: "
				+ this.birthDateString + " SSN: " + this.SSN + " Salary: " + this.salary + " ";

	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeIdString, firstNameString, middleInitialString, lastNameString, birthDateString,
				SSN, salary);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	    Employee clonedEmployee = null;
        try{
        	clonedEmployee = (Employee) super.clone();
            

        }catch (CloneNotSupportedException cns) {
            System.out.println(cns.toString());
        }
        return clonedEmployee;
	}

}
