package lesson_Standard_Exam_2;

public class CD  extends LendingItem{
	private Integer numCopiesLib;
	private String productIdString;
	private String titleString ;
	private String companyString;
	public CD(String productIdString, String titleString, String companyString) {
		
	
		this.productIdString = productIdString;
		this.titleString = titleString;
		this.companyString = companyString;
	}
	

	public boolean equals(Object obj) {
		if(obj instanceof CD) {
			CD cd = (CD) obj;
			
			
			if(cd.productIdString.equals(this.productIdString) &&cd.titleString.equals(this.titleString) && cd.companyString.equals(this.companyString)) {
				return true;
			
		}}
		return false;
	}
}
