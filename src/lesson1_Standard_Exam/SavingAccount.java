package lesson1_Standard_Exam;

public class SavingAccount extends Account {
	
	private double balance ;
	private double interestRate ;
	private String acctIdString;
	
	
	public SavingAccount(String acctIdString, double interestRate, double balance) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctIdString = acctIdString;
	}
	@Override
	
	String getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	double computeUpdatedBalance() {
		
		return (this.balance + (this.interestRate * balance));
	}
	

}
