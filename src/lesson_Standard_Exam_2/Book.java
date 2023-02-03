package lesson_Standard_Exam_2;

public class Book extends LendingItem{

	private Integer numCopiesLib;
	
	private String isbnString ;
	private String titleString;
	private String authorFirstNameString;
	private String authorLastNameString ;
	public Book( String isbnString, String titleString, String authorFirstNameString,
			String authorLastNameString) {
		
		
		this.isbnString = isbnString;
		this.titleString = titleString;
		this.authorFirstNameString = authorFirstNameString;
		this.authorLastNameString = authorLastNameString;
	}
	




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Book) {
			Book book = (Book) obj;
			
			if(book.isbnString.equals(this.isbnString) && book.titleString.equals(this.titleString) && book.authorFirstNameString.equals(this.authorFirstNameString) && book.authorFirstNameString.equals(this.authorLastNameString)) {
				return true;
			
		}
			}
		return false;
	}
	
	
	
	
}
