package lesson1_Design_2;

public class Reservation {

	IMember member;
	IItem iItem;

	public Reservation( IItem iItem) {

		
		this.iItem = iItem;
	}

	public boolean checkAvailability() {
		if(iItem.checkAvailability()) {
			return true;
		}
		
		return false;
	}

	
	

}
