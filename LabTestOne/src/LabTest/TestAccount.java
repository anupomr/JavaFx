package LabTest;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) 
	{
		SavingsAccount newSavingsAccount= new SavingsAccount(0.5);
		CheckingAccount newCheckingAccount=new CheckingAccount(100);
		
		
		//**************
		Scanner read= new Scanner (System.in);
		int input;
		do 
		{
			System.out.println("\nWhich of the following accounts you wish to deal with today? ");
			System.out.println("Pleasse Enter 1 or 2 and 3 for exit");
			System.out.println("1. Savings");
			System.out.println("2. Checking");
			System.out.println("3. Quit");
		
			input=read.nextInt();
		if(input==1) 
		{
			System.out.println("You have chosen Savings !!!");
			//Start Code for Internal loop
			int choice, save, transfer;
			
				System.out.println("\nWhat do youwant to do with your Savings?? ");
				System.out.println("1. Deposit");
				System.out.println("2. Transfer Funds to my Checking");
				System.out.println("3. Add interest to my Saving account");
			
				choice=read.nextInt();
			if(choice==1) 
			{
				
				System.out.println("Enter an Integer amount you wish to deposit : ");
				save=read.nextInt();
				newSavingsAccount.deposit(save);
				
				System.out.println("$"+save+" has been successfully deposited"
						+ "in your savings!! ");
				System.out.println("My Savings belence now = $"+newSavingsAccount.getBalance());
				
			}
			else if(choice==2) 
			{
				System.out.println("Enter an Integer amount you wish to Transfer : ");
				transfer=read.nextInt();
				newSavingsAccount.transfer(newCheckingAccount, transfer);
				System.out.println("$"+transfer+"has been successfully "
						+ "transfered to your Checking Account!! ");
				System.out.println("\nMy Savings account belence now = $"+newSavingsAccount.getBalance());
				System.out.println("\nMy Checking account belence now = $"+newCheckingAccount.getBalance());
			}
			else 
			{
				System.out.println("Interest has been successfully calculated  and deposited in your savings account.");
				newSavingsAccount.addInterest();
				System.out.println("\nMy Savings account belence now = $"+newSavingsAccount.getBalance());
				System.out.println("\nMy Checking account belence now = $"+newCheckingAccount.getBalance());
			}
			
			
		
			//End Code for Internal loop
		}
		else if(input==2) 
		{
			System.out.println("You have chosen Checking !!!");
			
			//Start Code for Checking Internal loop
			
			int option, deposit, withdraw;
			do 
			{
					System.out.println("\nWhat do youwant to do with your Checking?? ");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Quit");
				
					option=read.nextInt();
				if(option==1) 
				{
					
					System.out.println("Enter an Integer amount you wish to deposit : ");
					deposit=read.nextInt();
					newCheckingAccount.deposit(deposit);
					
					System.out.println("$"+deposit+" has been successfully deposited"
							+ "in your Checking!! ");
					System.out.println("My Checking belence now = $"+newCheckingAccount.getBalance());
					
				}
				else if(option==2) 
				{
					System.out.println("Enter an Integer amount you wish to Withdraw : ");
					withdraw=read.nextInt();
					newCheckingAccount.withdraw(withdraw);
					
					
					System.out.println("$"+withdraw+"has been successfully "
							+ "withdraw to your Checking Account!! ");
					
					System.out.println("\nMy Checking account belence now = $"+newCheckingAccount.getBalance());
				}
			}while(option !=3);
			//End Code for Internal loop
		}
		else if(input==3) 
		{
			System.out.println("\nMy final Savings account belence now = $"+newSavingsAccount.getBalance());
			System.out.println("\nMy final Checking account belence now = $"+newCheckingAccount.getBalance());
			System.out.println("Bye now !!!!");
		}
		
		else
			{
			System.out.println("In valide Choice");
			System.out.println("Pleasse Enter 1 to 4");

			}
		}while(input!=3);


		//*****/***********
	}

}
