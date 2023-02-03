package lesson3_lab_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
	private String nameString;
	private String locationString;

	List<Position> positions;

	public Department(String nameString, String locationString) {
		super();
		this.nameString = nameString;
		this.locationString = locationString;
		positions = new ArrayList<>();

	}

	public void addPosition(Position position) {
		positions.add(position);
	}

	public void print() {
		System.out.println(
				" ----------- Department: " + this.nameString + "  " + " --------- Location: " + this.locationString);
		System.out.println(" ");
	 /*	for (Position position : this.positions) {
			position.print();
		} */
		positions.stream().forEach(position -> position.print());

	}

	public int getSlary() {
		int result = 0;
		
		/*
		for (Position position : positions) {
			result += position.getSlary();
		} */
		result = positions.stream().mapToInt(Position::getSlary).sum();
		return result;
	}

	public void printReportingHierarchy() {
		
		/*
		for (Position position : positions) {
			if (position.getSupperior() != null && this.equals(position.getSupperior())) {

			}
		} */
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Department)) {
			return false;
		}
		Department department = (Department) obj;

		boolean isEqual = department.locationString.equals(this.locationString)
				&& department.nameString.equals(this.nameString) && department.positions.equals(this.positions);

		return isEqual;
	}

	public String toString() {

		return " " + this.locationString + " " + this.nameString + " " + positions.toString() + " ";

	}
	@Override
	public int hashCode() {
		return Objects.hash(locationString,nameString,positions);
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		Department department = (Department) super.clone();
		department.positions = this.positions;
		return department;
	}
}
