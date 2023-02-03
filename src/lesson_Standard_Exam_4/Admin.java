package lesson_Standard_Exam_4;

import java.util.Iterator;

public class Admin {
	
	Department[] deptsDepartments = new Department[3];

	public Admin(Department[] deptsDepartments) {
		
		this.deptsDepartments = deptsDepartments;
	}
	public String hourlyCompanyMessage() throws EmptyQueueException {
		StringBuilder outPutString =new StringBuilder();
		for(Department department : deptsDepartments) {
			String msgString = department.getQueue().peek();
			department.getQueue().dequeue();
			String nameString = department.getName();
			outPutString.append(format(nameString, msgString)).append("\n");
			
		
					
					
		}
		return outPutString.toString();
		
				
	}
	public String format(String nameString , String msgString ) {
		String formatedString = nameString + " : " +msgString;
		return formatedString;
				
		
	}
	
	

}
