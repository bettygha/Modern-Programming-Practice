package lesson1_Design_2;

import java.util.List;

public class AItem implements IItem {

	private String titleString;
	
	List<IItemCopy> itemCopies ;
	
	@Override
	public boolean checkAvailability() {
		
		return false;
	}

	public List<IItemCopy> getItemCopies() {
		return itemCopies;
	}

	public void addItemCopies(List<IItemCopy> itemCopies) {
		this.itemCopies = itemCopies;
	}



	@Override
	public void addItemCopy(IItemCopy itemCopy) {
		// TODO Auto-generated method stub
		itemCopies.add(itemCopy);
		
	}
	
	

}
