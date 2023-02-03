package lesson_Standard_Exam_2;

public class LibraryMember {
	private String memberIdString;
	private String firstNameString;
	private String lastNameString ;
	private String phoneString ;
	
	
	private CheckoutRecord checkoutRecord;

	public LibraryMember(String memberIdString, String firstNameString, String lastNameString, String phoneString) {
		
		this.memberIdString = memberIdString;
		this.firstNameString = firstNameString;
		this.lastNameString = lastNameString;
		this.phoneString = phoneString;
		
	}

	public String getMemberIdString() {
		return memberIdString;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public String getPhoneString() {
		return phoneString;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
	

}
