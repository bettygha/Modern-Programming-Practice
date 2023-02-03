package lesson1_Design_2;

import java.util.ArrayList;
import java.util.List;

public class Book extends AItem {
	private String ISBAN;
	private List<String> authorList;
	private int limit;
	
	List<IItemCopy> itemCopies ;
	
	public Book(String iSBAN, List<String> authorList, int limit) {
		super();
		ISBAN = iSBAN;
		this.authorList = authorList;
		this.limit = limit;
		itemCopies = new ArrayList<>();
	}
	
	
	@Override
	public void addItemCopy(IItemCopy itemCopy) {
		// TODO Auto-generated method stub
		itemCopies.add(itemCopy);
		
	}


	@Override
	public boolean checkAvailability() {
		
		for(IItemCopy iItemCopy : itemCopies) {
			if(iItemCopy.checkAvailability()) {
				iItemCopy.setAvailability(false);
				return true;
				
			}
			
		}
		return false;
	}
	
	

}
