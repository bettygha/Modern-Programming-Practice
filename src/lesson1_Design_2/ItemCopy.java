package lesson1_Design_2;

import java.util.Iterator;

public class ItemCopy implements IItemCopy {

	private String copyidString;
	private boolean available;

	Loan loan;
	IItem item;

	public ItemCopy(String copyidString, boolean available, IItem iItem) {
		super();
		this.copyidString = copyidString;
		this.available = available;
		this.item = iItem;
	}

	public String getCopyidString() {
		return copyidString;
	}

	public void setCopyidString(String copyidString) {
		this.copyidString = copyidString;
	}

	
	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public IItem getItem() {
		return item;
	}

	public void setItem(IItem item) {
		this.item = item;
	}

	@Override
	public boolean checkAvailability() {
		// TODO Auto-generated method stub
		return this.available;
	}

	@Override
	public void setAvailability(boolean bool) {
		this.available = bool;
		
	}
	

}
