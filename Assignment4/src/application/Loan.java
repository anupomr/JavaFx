package application;

public class Loan 
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
	{
		this.setAnnualInterestRate(annualInterestRate);
		this.setNumberOfYears(numberOfYears);
		this.setLoanAmount(loanAmount);
	}
	
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}

	
	public int getNumberOfYears() 
	{
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) 
	{
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() 
	{
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) 
	{
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment() 
	{
		double monthlyInterestRate=annualInterestRate/12.00;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12))); 
		return monthlyPayment;
		
	}




}
