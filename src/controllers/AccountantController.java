package controllers;

import java.util.Scanner;


public class AccountantController {

	Scanner scanner;
	
	public AccountantController() {
		scanner = new Scanner(System.in);
	}
	
	
	public void welcome(String name) {
		System.out.println("*** ACCOUNTANT PAGE ***");
		System.out.println("Welcome " + name);
		showOptions();
		selectAnOption();
	}
	

	public void showOptions() {
		System.out.println("------------------------------------------------");
		System.out.println("please choose an option");
		System.out.println("(1*) Add a new staff grade");
		System.out.println("(2*) Change the grade for a member of staff");		
		System.out.println("(3) Show all the grades ");
		System.out.println("(4) Show all the staffs" );
		System.out.println("(5) Log out");
		
		System.out.println("------------------------------------------------");

	}
	
	public void selectAnOption() {
		int option = scanner.nextInt();
		
		if(option < 0 || option > 5 ) {
			System.out.println("Please choose a valid option");
			showOptions();
			selectAnOption();
			return;
		}
		
		goToOption(option);
	}
	
	public void goToOption(int option) {
		switch (option) {
		case 1:
			
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 2:
			
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 3:
			
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 4:
			
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 5:						
			AccountController accountController = new AccountController();
			System.out.println("Logging out...");
			accountController.logOut();
			break;
			
		default:
			break;
		}
	}
	
	
	
}
