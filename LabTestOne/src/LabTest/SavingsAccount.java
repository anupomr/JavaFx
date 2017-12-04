package LabTest;

public class SavingsAccount extends BankAccount
{
	private double interestRate;
	public  SavingsAccount(double rate) 
	{
		interestRate=rate;
	}
	
	public void addInterest()
	{
		double interest=super.getBalance()*interestRate/100;
		super.deposit(interest);
	}
	
	

}
