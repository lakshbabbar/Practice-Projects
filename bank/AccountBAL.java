package com.hcl.bank;

public class AccountBAL {
	public static Accounts searchAccountDao(int accountNo){
		return new AccountDao().searchAccountDao(accountNo);
	}
	
	public static String createAccountBal(Accounts objAccounts){
		return new AccountDao().CreateAccountDao(objAccounts);
	}
	public static int generateAccountBal(){
		return new AccountDao().generateAccountNoDao();
		
	}
	public static String updateAccountBal(int accountNo,String city,String State){
		return new AccountDao().updateAccountDao(accountNo,city,State);
	}
   public static String closeAccountBal(int accountNo){
	   return new AccountDao().closeAccountDao(accountNo);
   }
   public static String depositAccountBal(int accountNo,int depositAmount){
	   return new AccountDao().depositAccountDao(accountNo, depositAmount);
   }
   public static String withdrawAccountBal(int accountNo,int withdrawAmount){
	   return new AccountDao().withdrawAccountDao(accountNo, withdrawAmount);
   }
}
