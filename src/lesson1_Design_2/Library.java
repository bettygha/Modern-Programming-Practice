package lesson1_Design_2;

import java.util.List;

public class Library {

	
	
	private List<IItemCopy> itemCopies;
    private List<IMember> members;
    
	public List<IItemCopy> getItemCopies() {
		return itemCopies;
	}
	public void addItemCopies(List<IItemCopy> itemCopies) {
		this.itemCopies = itemCopies;
	}
	public List<IMember> getMembers() {
		return members;
	}
	public void addMembers(List<IMember> members) {
		this.members = members;
	}
	public void history() {
		for(IMember member : members) {
			List<Loan> loans = member.getLoans();
			//loans.forEach(x -> System.out.println("******** Reservation History \n"+x.member.getNameString()));
			
			List<Reservation> reservations =  member.getReservations();
			//reservations.forEach(x -> System.out.println("******* Loan History \n" + x));
			
		}
		
	}

    
}
