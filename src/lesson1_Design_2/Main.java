package lesson1_Design_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Library library = new Library();
		
		
		IMember memberOne = new Member("12", "Abebe", "Kolfe", "0932-50");
		IMember memberTwo = new Member("10", "Kebede", "Kolfe", "0932-50");

		List<IMember> members = new ArrayList<>();
		members.add(memberOne);
		members.add(memberTwo);
		
		library.addMembers(members);
		
		List<String> authorList = new ArrayList<>();
		authorList.add("Henok");
		authorList.add("Abel");
		
		IItem bookOne = new Book("11", authorList, 2);
		IItem bookTwo = new Book("2", authorList, 3);
		
		IItem magazineOne = new Magazine(1, 1222);
		IItem magazineTwo = new Magazine(2, 3333);
		
		
		
		 IItemCopy bookCopyOne = new ItemCopy("1",true,bookOne);
	     IItemCopy bookCopyTwo = new ItemCopy("2",true,bookOne);
	    // IItemCopy bookCopyThree = new ItemCopy("3",true,bookTwo);
		
	    
	     
	     bookOne.addItemCopy(bookCopyOne);
	     bookOne.addItemCopy(bookCopyTwo);
	    // bookOne.addItemCopy(bookCopyThree);
	        
	     memberOne.reserve(bookOne);
	    
	     
	     memberOne.borrow(bookCopyTwo, LocalDate.now(), LocalDate.now().plusDays(3));
	    // memberOne.returnn(bookCopyTwo);
	     
	     memberTwo.reserve(bookOne);
	     
	     library.history();
	     
		
	}
}
