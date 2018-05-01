package controllers;

import views.Accountant.AccountantView;

public class AccountantController {

	private AccountantView accountantView;
	
	public void welcome() {
		accountantView = new AccountantView();
		accountantView.welcome();
	}
	
	
	
}
