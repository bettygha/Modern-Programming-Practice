package lesson1_Design_2;

import java.util.List;

public class Magazine extends AItem{
	private int limit ;
	private int issue ;
	List<IItemCopy> itemCopies ;
	public Magazine(int limit, int issue) {
		super();
		this.limit = limit;
		this.issue = issue;
	}
	
	
	@Override
	public void addItemCopy(IItemCopy itemCopy) {
		
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
