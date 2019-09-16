package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
 public static void main(String[] args) {
	int accountno=AccountBAL.generateAccountBal();
	//System.out.println(accountno);
	Accounts objAccounts=new Accounts();
	objAccounts.setAccountNo(accountno);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Name");
	objAccounts.setFirstName(sc.nextLine());
	System.out.println("Enter the Last Name");
	objAccounts.setLastName(sc.nextLine());
	System.out.println("Enter city");
	objAccounts.setCity(sc.nextLine());
	System.out.println("Enter state");
	objAccounts.setState(sc.nextLine());
	System.out.println("Enter Amount");
	objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
	System.out.println("Enter cheqFacil ");
	objAccounts.setCheqFacil(sc.nextLine());
	System.out.println("Enter Account Type ");
	objAccounts.setAccountType(sc.nextLine());
	System.out.println(AccountBAL.createAccountBal(objAccounts));
}
}
