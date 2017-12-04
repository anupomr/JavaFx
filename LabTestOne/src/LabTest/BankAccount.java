package LabTest;

public class BankAccount 
{

	private double balance;
	
	public  BankAccount()
	{
		balance=0;
	}
	public  BankAccount(double ampont)
	{
		balance=ampont;
	}
	public void deposit(double amount) 
	{
		balance+=amount;
	}
	public void withdraw(double amount) 
	{
		balance-=amount;
	}
	public void transfer(BankAccount transferAccount, double transferMoney) 
	{
		this.withdraw(transferMoney);
		transferAccount.deposit(transferMoney);
	}
	public double getBalance() 
	{
		return balance;
	}
}
