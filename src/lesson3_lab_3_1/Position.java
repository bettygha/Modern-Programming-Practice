package lesson3_lab_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {
	private String titleString;
	private String descriptionString;

	private Employee employees  ;
	
	private Position supperior;
	List<Position> inferiors ;

	public Position(String titleString, String descriptionString, Employee employees) {

		this.titleString = titleString;
		this.descriptionString = descriptionString;
		this.employees = employees;
		inferiors = new ArrayList<>();
	}

	public void print() {
		System.out.println(
				"------ Position title: " + this.titleString + "  " + "----- Description: " + this.descriptionString);

//		for (Employee employee : this.employees) {
//			System.out.println(" ");
			this.employees.print();
//		}
	}

	public int getSlary() {
		int result = 0 ;
		result = this.employees.getSlary();
//		for(Employee employee : employees) {
//			result +=employee.getSlary(); 
//		}
		return result;
	}
	public void printDownLine(int indent) {
		
		

		for(int i = 0 ; i<indent ;i++) {
			System.out.println("");
		}
		/*
		for(Position inferior : inferiors) {
			System.out.println("Inferior worker ----- ");
			System.out.println(" ");
			System.out.println(inferior.titleString + " ");
			
			inferior.print();

			inferior.printDownLine(indent + 2);
			
		} */
		inferiors.stream().forEach(inferior->{
			System.out.println("Inferior worker ----- ");
			System.out.println(" ");
			System.out.println(inferior.titleString + " ");
			
			inferior.print();

			inferior.printDownLine(indent + 2);
			
		});


	}
	

	public boolean isManager (Employee employee) {
		return false;
	}

	public Position getSupperior() {
		return supperior;
	}

	public void setSupperior(Position supperior) {
		this.supperior = supperior;
	}

	public List<Position> getInferiors() {
		return inferiors;
	}

	public void setInferiors(List<Position> inferiors) {
		this.inferiors = inferiors;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Position)) {
			return false;
		}
		Position position = (Position) obj;
		boolean isEqual = position.titleString.equals(this.titleString) &&
				position.descriptionString.equals(this.descriptionString) &&
				position.employees.equals(this.employees);
		
		return isEqual;
	}
	@Override
	public String toString() {
		
		return this.titleString + " " +this.descriptionString + " " + this.employees.toString()+ " ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(titleString,descriptionString,employees);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Position clonedPosition = (Position) super.clone();
		clonedPosition.employees = this.employees;
		clonedPosition.supperior = this.supperior;
		
		return clonedPosition;
	}
	
	
	

}
