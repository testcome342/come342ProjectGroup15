package views.Account;

import java.util.Scanner;

import controllers.AccountController;

public class LogInView {

	private AccountController accountController = new AccountController();
	private Scanner scanner;
	
	public LogInView() {
		scanner = new Scanner(System.in);
		
	}
		
	public void welcome() {
		
		String name, password;
		
		System.out.println("Welcome to Agate. Please log in to continue.");
		
		System.out.println("name: ");
		name = scanner.next().trim();
		
		System.out.println("password: ");
		password = scanner.next().trim();
				
		accountController.logIn(name, password);
								
	}
	
	public void error() {
		System.out.println(" !!! Name or password is incorrect, please try again. !!!");
		accountController.logIn();
	}
	
	
}
