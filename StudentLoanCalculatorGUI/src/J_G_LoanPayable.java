/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: Interface: J_G_LoanPayable
	 * @Purpose: Holds a constant value. The interface also has an abstract method called calculateLoanPayment
	 * @Date: August 2, 2022
	 */

public interface J_G_LoanPayable {
	//constant value;
	public final double ANNUAL_RATE_TO_MONTHLY_RATE = 1.0 / 1200.0;
	
	//abstract Method of calculateLoanPayment
	public abstract double calculateLoanPayment(double amount, double rate, int amortization);
	
}


