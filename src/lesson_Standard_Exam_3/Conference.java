package lesson_Standard_Exam_3;

import java.util.ArrayList;
import java.util.List;

public class Conference {

	private String nameString ;
	private double fullConferenceFee;
	
	List<IAttendee> iAttendees;

	public Conference(String nameString, double fullConferenceFee) {
		super();
		this.nameString = nameString;
		this.fullConferenceFee = fullConferenceFee;
		iAttendees = new ArrayList<>();
		
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public double getFullConferenceFee() {
		return fullConferenceFee;
	}

	public void setFullConferenceFee(double fullConferenceFee) {
		this.fullConferenceFee = fullConferenceFee;
	}

	public List<IAttendee> getiAttendees() {
		return iAttendees;
	}

	public void addiAttendees(List<IAttendee> iAttendees) {
		this.iAttendees = iAttendees;
	}
	
	public double getTotalPayments() {
		double total=0 ;
		for(IAttendee iAttendee : iAttendees) {
			total+= iAttendee.getRegistrationFee();
		}
		return total;
	
	}
	
	
	
	
}
