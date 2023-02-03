package lesson7_ClassExcercise;

import java.util.Date;

public class Equal {
	String name;
	String salaryString ;
	Date dobDateRange;
	@Override
	public boolean equals(Object obj) {
		
		if(obj.getClass().equals(this.getClass())) {
			Equal equal = (Equal) obj;
			
			return equal.name.equals(this.name) && equal.salaryString.equals(this.salaryString) && equal.dobDateRange.equals(this.dobDateRange);
		}
		return false;
	}
	
	
	
	

}
