package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAmountMain {

	public static void main(String[] args) {
		int accountNo;
		int withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		accountNo=sc.nextInt();
		System.out.println("Enter the Amount to withdraw");
		withdrawAmount=sc.nextInt();
		System.out.println(AccountBAL.withdrawAccountBal(accountNo, withdrawAmount));
	}
}
