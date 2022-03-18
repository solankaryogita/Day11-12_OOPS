package com.Bridgelabz.eleven_twelve1;
import java.util.Scanner;
public class Account1 {
	static Scanner scanner = new Scanner(System.in);
    private double balance;
	
  public Account1(double intialBalance) {
		balance = intialBalance;

	}

   public void debit(double balance) {
		System.out.println("enter ammount to withdraws");
		double withdraw = scanner.nextDouble();

		if (withdraw > balance)
			System.out.println("Debit amount exceeded account balance");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public void deposit(double depositAmount) {
		balance = depositAmount;
	}

	public boolean withdraw(double withdrawAmount) {

		if (withdrawAmount > balance) {
			System.out.println("Transaction cancelled due to Insufficient Funds");
			return false;
		} else {
			balance = withdrawAmount;
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the balance to mention in the account");
		Account1 account = new Account1(scanner.nextDouble());
		account.debit(account.balance);
	}

}
