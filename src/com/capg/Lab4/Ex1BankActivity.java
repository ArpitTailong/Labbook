package com.capg.Lab4;

public class Ex1BankActivity {
	
	int flag=0;
	public void deposit(Ex1Account account,double amount) {
		double currentBal=account.getBalance();
		double updatedBal=currentBal+amount;
		account.setBalance(updatedBal);
	}
	public void withdraw(Ex1Account account,double amount) {
		double currentBal=account.getBalance();
		if(currentBal>=amount) {
			flag=1;
		double updatedBal=currentBal-amount;
		account.setBalance(updatedBal);
		}
		else {
			flag=0;
			
			System.out.println("Insufficient Balance");
		}
		
	}
	public int transfer(Ex1Account fromAcc, Ex1Account toAcc, double amount) {
		double currentBalDebAcc=fromAcc.getBalance();
		double currentBalCreAcc=toAcc.getBalance();
		if(currentBalDebAcc>=amount) {
		flag=1;
		double updateBalDebAcc= currentBalDebAcc-amount;
		double updateBalCreAcc= currentBalCreAcc+amount;
		fromAcc.setBalance(updateBalDebAcc);
		toAcc.setBalance(updateBalCreAcc);
		}
		else
		{
			flag=0;
			System.out.println("Insufficient Balance");
		}
		return flag;
	}
	

}
