package lesson_Standard_Exam_2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	  //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	  public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
	    List<String> phoneNums = new ArrayList<>();
	    //implement
	    
	    for(LibraryMember member : members) {
	    	List<CheckoutRecordEntry>  checkoutRecordEntries = member.getCheckoutRecord().getCheckoutRecordEntries();
	    	
	    	for(CheckoutRecordEntry checkoutRecordEntry : checkoutRecordEntries) {
	    		if(checkoutRecordEntry.getLendingItem().equals(item)) {
	    			phoneNums.add(member.getPhoneString() );
	    			
	    		}
	    	}
	    }
	    return phoneNums;
	  }
	}
