package lesson1_Standard_Exam;

public class CheckingAccount  extends Account{
	
	private double balance ;
	private double monthlyFee;
	private String acctIdString;
	

	public CheckingAccount(String acctIdString, double monthlyFee, double balance) {
		super();
		this.balance = balance;
		this.monthlyFee = monthlyFee;
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
		
		// TODO Auto-generated method stub
		return (this.balance -this.monthlyFee);
	}

}
