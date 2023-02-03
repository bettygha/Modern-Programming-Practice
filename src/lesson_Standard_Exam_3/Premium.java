package lesson_Standard_Exam_3;

public class Premium  extends Session{

	private String nameString ;
	private double fee;
	
	
	
	public Premium(String nameString, double fee) {
		super();
		this.nameString = nameString;
		this.fee = fee;
	}



	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return super.getFee();
	}

	
}
