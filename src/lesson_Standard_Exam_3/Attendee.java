package lesson_Standard_Exam_3;

public abstract class Attendee implements IAttendee{

	private String nameString ;
	private String addressString;
	
	Conference conference;
	
	
	public Attendee(String nameString, String addressString) {
		super();
		this.nameString = nameString;
		this.addressString = addressString;
	}

	@Override
	public String getNameString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAddress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract double getRegistrationFee() ;
		// TODO Auto-generated method st

}
