package lesson1_Lab5_1;

import java.time.LocalDate;

public class Paycheck {
	private double grossPay ;
	private double fica = 0.23;
	private double state = 0.05  ;
	private double local= 0.01 ;
	private double medicare = 0.3;
	private double socialSecurity = 0.075 ;
	private DateRange dateRangeDate;
	
	
	
	public Paycheck(double grossPay, DateRange localDate) {
		super();
		this.grossPay = grossPay;
		this.dateRangeDate = localDate;
	}
	public void print() {
		String outPut = "Gross Pay :" + grossPay + '\n' + 
		        "Fica interest :" +  (fica * grossPay) + '\n' +
		        "State interest :" + (state * grossPay) + '\n' + 
		        "Local interest :" + (local  * grossPay)+ '\n' +
		        "Medicate interst :" + (medicare * grossPay) + '\n'+
		        "SocialSecurity interst :" + (socialSecurity * grossPay) + '\n';
		    System.out.println(outPut);
		    System.out.println( " ********* Ney Pay: " + getNetPay());
		    System.out.println("  ");
		
		
	}
	public double getNetPay() {
		double result = grossPay -((grossPay * fica) + (grossPay * state ) +
		        (grossPay * local ) + (grossPay * medicare) + (grossPay * socialSecurity));
	
		return  result;
		
		
	}
	public DateRange getDateRangeDate() {
		return dateRangeDate;
	}
	
	
	

}
