package lesson_Standard_Exam_3;

public class FullAttendee extends Attendee{

	public FullAttendee(String nameString, String addressString) {
		super(nameString, addressString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRegistrationFee() {
		return 4000.00;
		
		
	}

	
}
