package com.capg.Lab4;

public class Ex1Current extends Ex1BankActivity{
	
	double overdraftLimit=50000;
	static long accno=101;
	
	public Ex1Current(){
		accno=accno+1;
	}
	
	@Override
	public void withdraw(Ex1Account account,double amount) {
		if(overdraftLimit>=amount) {
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
		
		if(overdraftLimit>=amount) {
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
				System.out.println("OverDraft Limit Reached");
			}
		}
		return flag;
		
	}
	
}
