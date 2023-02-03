package lesson1_Design_2;

import java.time.LocalDate;

public class Loan  {
	
	IItemCopy itemCopy;
	
	private LocalDate check_out_dateDate;
	private LocalDate return_Date;
	
	
	Member member;
	  public Loan(IItemCopy itemCopy, LocalDate checkOutDate, LocalDate returnDate) {
	        this.itemCopy = itemCopy;
	        this.check_out_dateDate = checkOutDate;
	        this.return_Date = returnDate;
	    }
	public IItemCopy getItemCopy() {
		return itemCopy;
	}
	public void setItemCopy(IItemCopy itemCopy) {
		this.itemCopy = itemCopy;
	}
	public LocalDate getCheck_out_dateDate() {
		return check_out_dateDate;
	}
	public void setCheck_out_dateDate(LocalDate check_out_dateDate) {
		this.check_out_dateDate = check_out_dateDate;
	}
	public LocalDate getReturn_Date() {
		return return_Date;
	}
	public void setReturn_Date(LocalDate return_Date) {
		this.return_Date = return_Date;
	}
	  
	
	

}
