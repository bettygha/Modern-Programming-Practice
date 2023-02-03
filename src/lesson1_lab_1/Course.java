package lesson1_lab_1;

public class Course {
	
	private String numberString ; 
	private String titleString ;
	private int units ;
	
	
	public Course(String numberString, String titleString, int units) {
		super();
		this.numberString = numberString;
		this.titleString = titleString;
		this.setUnits(units);
		
	}

	@Override
	public boolean equals(Object obj) {
	/*	
		if (obj instanceof Course) {
			Course course = (Course) obj;
			return course.numberString.equals(this.numberString) && course.titleString.equals(titleString)
					&& course.getUnits() == this.getUnits();
					

		}
		return false;   */
	return (obj instanceof Course) && ((Course) obj).numberString.equals(this.numberString)
			&& ((Course) obj).titleString.equals(titleString) && ((Course) obj).getUnits() == this.getUnits();
	  
		
		
		
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

}
