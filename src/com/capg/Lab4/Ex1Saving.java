package com.capg.Lab4;

public class Ex1Saving extends Ex1BankActivity{
	
	final double minBal=5000;
	static long accno=101;
	
	public Ex1Saving(){
		accno=accno+1;
	}
	
	@Override
	public void withdraw(Ex1Account account,double amount) {
		if(minBal>=amount) {
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
	}

	@Override
	public int transfer(Ex1Account fromAcc, Ex1Account toAcc, double amount) {
		
		if(minBal>=amount) {
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
		}
		return flag;
		
	}
	
}
