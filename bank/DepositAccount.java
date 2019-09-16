package com.hcl.bank;

import java.util.Scanner;

public class DepositAccount {

	public static void main(String[] args) {
		int accountNo;
		int depAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no ");
		accountNo=sc.nextInt();
		System.out.println("Enter deposit amount ");
		depAmount= sc.nextInt();
		System.out.println(AccountBAL.depositAccountBal(accountNo, depAmount));
	}
}
