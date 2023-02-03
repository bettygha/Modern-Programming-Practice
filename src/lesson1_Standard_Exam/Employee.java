package lesson1_Standard_Exam;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String nameString ;
	private List<Account> accounts;
	
	
	public Employee(String string) {
		// TODO Auto-generated constructor stub
		this.nameString = nameString;
		accounts = new ArrayList<>();
	}


	public double computeUpdatedBalanceSum() {
		double result = 0.0;
		for(Account account : accounts) {
			result+= account.computeUpdatedBalance();
			
		}
		return result;
	}


	public String getNameString() {
		return nameString;
	}

	public void addAccount(Account account) {
		accounts.add(account);
		
	}

	
	

}
