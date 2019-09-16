package com.hcl.bank;

import java.util.Scanner;

public class closeAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter AccountNO  ");
		accountNo=sc.nextInt();
		System.out.println(AccountBAL.closeAccountBal(accountNo));
	}
}
