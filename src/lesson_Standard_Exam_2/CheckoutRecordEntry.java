package lesson_Standard_Exam_2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	LocalDate checkOutDate;
	LocalDate dueDate;
	
	LendingItem lendingItem;
	ItemType itemType;
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate dueDate, LocalDate checkOutDate, ItemType itemType) {
		super();
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.itemType = itemType;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public void setLendingItem(LendingItem lendingItem) {
		this.lendingItem = lendingItem;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	
	

}
