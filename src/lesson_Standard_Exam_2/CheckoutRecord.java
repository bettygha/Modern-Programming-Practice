package lesson_Standard_Exam_2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	List<CheckoutRecordEntry> checkoutRecordEntries;

	
	public CheckoutRecord() {
		checkoutRecordEntries  = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
		return checkoutRecordEntries;
	}

	public void setCheckoutRecordEntries(List<CheckoutRecordEntry> checkoutRecordEntries) {
		this.checkoutRecordEntries = checkoutRecordEntries;
	}

	public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry) {
		// TODO Auto-generated method stub
		checkoutRecordEntries.add(checkoutRecordEntry);
		
	}
	
	
	
	
	

}
