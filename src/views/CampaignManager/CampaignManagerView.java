package views.CampaignManager;

import java.util.Scanner;

import controllers.AccountController;
import controllers.CampaignManagerController;

public class CampaignManagerView {
	
	Scanner scanner = new Scanner(System.in);
	AccountController accountController;
	CampaignManagerController campaignManagerController;
	
	
	public CampaignManagerView() {
		campaignManagerController = new CampaignManagerController();
	}
	
	
	public void welcome(String name) {
		System.out.println("***CAMPAIGN MANAGER PANEL***");
		System.out.println("Welcome " + name + ".Please choose an action:");
		
		showOptions();
		selectAnOption();
		
	}
	
	public void showOptions() {
		System.out.println("(1) Add a new client ");
		System.out.println("(2) Assign campaign staff to work on a campaign");
		System.out.println("(3) Assign a staff contact to a client ");
		System.out.println("(4) Show all the clients ");
		System.out.println("(5) Log out");
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
			campaignManagerController.addNewClient();
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			//
			showOptions();
			selectAnOption();
			break;
			
		case 5:
			accountController = new AccountController();
			System.out.println("Logging out...");
			accountController.logOut();
			break;

		default:
			break;
		}
		
		
	}
	
	
	
	
	
			
}
