package appstart;

//Selin Sakarya


import controllers.AccountController;


public class Main {
		
	public static void main(String[] args) {
	
		AccountController accountController = new AccountController();
		accountController.logIn();
				
	}

}
