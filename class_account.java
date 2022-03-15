package assignment;

import java.util.Scanner;

public class class_account {
	private double balance;
	public void account(double initialBalance) {
		if (initialBalance>0.0)
			balance=initialBalance;
	}
	public void credit(double amount) {
		balance=balance+amount;
	}
	public void debit(double amount) {
		balance=(balance-amount);
	}
	public double getBalance() { 
		return balance;
	}
	
public static void main(String[] args) {
	class_account account1 = new account (50.00);
    class_account account2 = new account (-7.53);
    
    System.out.printf("Account1 Balance: $%.2f\n", account1.getBalance());
    System.out.printf("Account2 Balance: $%.2f\n\n", account2.getBalance());
    
    Scanner input = new Scanner( System.in );
    double depositAmount;
    double debitAmount;
    System.out.print( "Enter deposit amount for account1: " ); 
    depositAmount = input.nextDouble(); 
    System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
    account1.credit( depositAmount );
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    
    System.out.print( "Enter deposit amount for account2: " ); 
    depositAmount = input.nextDouble(); 
    System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
    account2.credit( depositAmount ); 
    
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
    
    System.out.print( "Enter debit amount for account1: " );
    debitAmount = input.nextDouble();
    System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
    if (account1.getBalance()>=debitAmount) {
    account1.debit( debitAmount );
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    }
    else {
    System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
    }
    System.out.print( "Enter debit amount for account2: " );
    debitAmount = input.nextDouble();
    System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", debitAmount );
    if (account1.getBalance()>=debitAmount) {
    account1.debit( debitAmount );
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    }
    else {
    System.out.printf("!!!Debit amount exceeded account balance!!!\n\n");
    }
    }
}
	