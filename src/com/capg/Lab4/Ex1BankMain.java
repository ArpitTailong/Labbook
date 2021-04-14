package com.capg.Lab4;

public class Ex1BankMain {
	
	

	public static void main(String[] args) {
		
		Ex1BankActivity bank= new Ex1Saving();
		Ex1BankActivity bank2= new Ex1Current();
		Ex1Account account2=new Ex1Account();
		Ex1Account account3=new Ex1Account();
		Ex1Person p1= new Ex1Person();
		Ex1Person p2=new Ex1Person();
		
		double balance2=2000;
		account2.setAccNum(Ex1Saving.accno);
		p1.setName("Smith");
		p1.setAge(25);
		account2.setAccountType("Saving Account");
		account2.setBalance(2000.0);
		account3.setAccNum(Ex1Saving.accno);
		p2.setName("Kathy");
		p2.setAge(26);
		account3.setAccountType("Saving Account");
		account3.setBalance(3000.0);
		
		
		System.out.println("Before Transfer: Balance Available in debit account : "+
				account2.getBalance());
		System.out.println("Before Transfer: Balance Available in debit account : "+
				account3.getBalance());
		if(account2.getAccountType()=="Saving Account") {
		int a=bank.transfer(account2, account3, balance2);
		System.out.println();
		
		if(a==1) {
		System.out.println("After Transfer: Balance Available in debit account : "+
				account2.getBalance());
		System.out.println("After Transfer: Balance Available in credit account : "+
				account3.getBalance());
		}
		}
		else {
			int b=bank2.transfer(account2, account3, balance2);
			System.out.println();
			
			if(b==1) {
			System.out.println("After Transfer: Balance Available in debit account : "+
					account2.getBalance());
			System.out.println("After Transfer: Balance Available in credit account : "+
					account3.getBalance());
			}
		}

	}

}
