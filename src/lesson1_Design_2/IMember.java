package lesson1_Design_2;

import java.time.LocalDate;
import java.util.List;

public interface IMember {

	void reserve(IItem bookOne);
	void returnn(IItemCopy iItemCopy);
	void borrow(IItemCopy IItemCopy,LocalDate checkInDate , LocalDate returnDate) ;
	
	public List<Loan> getLoans();
	public List<Reservation> getReservations() ;
	


	

}
