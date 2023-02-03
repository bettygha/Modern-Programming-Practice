package lesson1_Design_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {

	private String idString;
	private String nameString;
	private String addressString;
	private String phoneNumberString;

	List<Reservation> reservations;
	List<Loan> loans;

	public Member(String idString, String nameString, String addressString, String phoneNumberString) {

		this.idString = idString;
		this.nameString = nameString;
		this.addressString = addressString;
		this.phoneNumberString = phoneNumberString;
		reservations = new ArrayList<>();
		loans = new ArrayList<>();

	}
	
	

	public String getIdString() {
		return idString;
	}



	public void setIdString(String idString) {
		this.idString = idString;
	}



	public String getNameString() {
		return nameString;
	}



	public void setNameString(String nameString) {
		this.nameString = nameString;
	}



	public String getAddressString() {
		return addressString;
	}



	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}



	public String getPhoneNumberString() {
		return phoneNumberString;
	}



	public void setPhoneNumberString(String phoneNumberString) {
		this.phoneNumberString = phoneNumberString;
	}



	public List<Reservation> getReservations() {
		return reservations;
	}


	public List<Loan> getLoans() {
		return loans;
	}


	public void reserve(IItem iItem) {
		
		Reservation reservation = new Reservation(iItem);
		if (reservation.checkAvailability()) {
			reservations.add(reservation);
			System.out.println("You have successfully reserved an item");

		}
		else {
			System.out.println("Sorry, The item you selected to reserve is not available !!");
		}
		

	}

	public void borrow(IItemCopy IItemCopy,LocalDate checkInDate , LocalDate returnDate) {
		Loan loan = new Loan(IItemCopy, checkInDate, returnDate);
		
		if(IItemCopy.checkAvailability()) {
			loans.add(loan);
			IItemCopy.setAvailability(false);
			System.out.println("You have successfully borrowed an item ");
		}
		else {
			System.out.println("Sorry, The item you selected to borrow is not available !! ");
		}
		
		
		
		
		

	}

	public void returnn(IItemCopy iItemCopy) {
		iItemCopy.setAvailability(true);
		for(Loan loan : loans) {
			
			if(loan.getItemCopy().equals(iItemCopy)) {
				
				loans.remove(loan);
				System.out.println("Thank You for returniing!!!");
				break;
				
			}
		}
		

		
		

	}

	

	

}
