package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no ");
		accountNo=sc.nextInt();
		Accounts objAccounts=AccountBAL.searchAccountDao(accountNo);
		if(objAccounts!=null){
			System.out.println("First Name "+objAccounts.getFirstName());
			System.out.println("Last Name "+objAccounts.getLastName());
			System.out.println("city Name "+objAccounts.getCity());
			System.out.println("State Name "+objAccounts.getState());
			System.out.println("Amount "+objAccounts.getAmount());
			System.out.println("cheqFacil "+objAccounts.getCheqFacil());
			System.out.println("Account Type "+objAccounts.getAccountType());
		}else{
			System.out.println("Account No Not Found");
		}
	}

}
