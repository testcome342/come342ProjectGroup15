package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Campaign;
import entities.CampaignStaff;
import entities.Client;
import entities.Staff;
import repositories.CampaignRepository;
import repositories.ClientRepository;
import repositories.StaffRepository;


// *** NOTE *** //
//In the beginning I thought about seperating controllers from sysouts (which is something that can be considered as UI in a console app)  
//and making UI classes
//but when I did this, I had problems with fakedb. 
//Everytime I tried to go back to relevant controller, fakedb had been reinitialized (as i expected) and no changes were visible in the list
//and to solve this issue i would have to make a worse design than this which is carrying a fakedb list everywhere via constructors
//but i didn't want to do this and i put sysouts in a controller even though i don't think this is the best way


public class CampaignManagerController {

	Scanner scanner;
	ClientRepository clientRepository;
	StaffRepository staffRepository;
	CampaignRepository campaignRepository;
	
	
	public CampaignManagerController() {	
		scanner = new Scanner(System.in);
		clientRepository = new ClientRepository();
		staffRepository = new StaffRepository();
		campaignRepository = new CampaignRepository();
	}
		
	public void welcome(String name) {
		System.out.println("***CAMPAIGN MANAGER PAGE***");
		System.out.println("Welcome " + name);
		showOptions();
		selectAnOption();
	}
	
	public void showOptions() {
		System.out.println("------------------------------------------------");
		System.out.println("please choose an action");
		System.out.println("(1*) Add a new client ");
		System.out.println("(2*) Assign campaign staff to work on a campaign");
		System.out.println("(3*) Assign a staff contact to a client ");
		System.out.println("(4) Show all the clients ");
		System.out.println("(5) Show all the campaigns");
		System.out.println("(6) Log out");
		System.out.println("------------------------------------------------");

	}
	
	public void selectAnOption() {
		int option = scanner.nextInt();
		
		if(option < 0 || option > 6 ) {
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
			addNewClient();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 2:
			assignCampaignStaff();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 3:
			assignAStaffContact();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 4:
			showAllClients();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 5:			
			showAllCampaigns();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 6:
			AccountController accountController = new AccountController();
			System.out.println("Logging out...");
			accountController.logOut();
			break;

		default:
			break;
		}
		
	}
	
	
	// 1
	public void addNewClient() {
		
		System.out.println("***Add new client page***");
		System.out.println("------------------------------------------------");

		Client newClient = new Client();
				
		System.out.println("Please enter client's: ");
		
		System.out.println("id: ");
		newClient.setId(scanner.nextInt());
		
		System.out.println("company name: ");
		newClient.setCompanyName(scanner.next());
		
		System.out.println("company address");
		newClient.setCompanyAddress(scanner.next());
		
		System.out.println("company e-mail");
		newClient.setCompanyEmail(scanner.next());
		
		
		clientRepository.Add(newClient);
		
		System.out.println("Client has been saved succesfully");
		System.out.println("You can now assign staff contact to this client anytime you want");
		
		System.out.println("------------------------------------------------");

		
				
	}
	
	//2 to work on a campaign
	public void assignCampaignStaff() {
		
		System.out.println("***assign campaign staff to work on a campaign***");
		
		System.out.println("------------------------------------------------");

		System.out.println("choose a campaign that you want to assign staff to work on");
		
		for (Campaign campaign : campaignRepository.getAll()) {
			System.out.println("(" + campaign.getId() + ")" + "kampanya adı: "+ campaign.getCampaignTitle() + " | client: "+ campaign.getClient().getCompanyName());
		}
		
		

		Campaign selectedCampaign = getSelectedCampaign(scanner.nextInt());

		System.out.println("selected campaign: " + selectedCampaign.getCampaignTitle());
		
		List<Integer> notAvailableStaffs = new ArrayList<>();	
		
		if (selectedCampaign.getCampaignStaffs() != null) {
			System.out.println("staffs that are already working on this campaign: ");
			for (Staff staff : selectedCampaign.getCampaignStaffs()) {
				System.out.println(staff.getName());
				notAvailableStaffs.add(staff.getId());
			}
		}
		else {
			System.out.println("nobody is working on this campaign yet");
		}
		
		System.out.println("press a key to add staff to work on this campaign");
		scanner.next();
		
		List<Staff> selectedCampaignStaffs = new ArrayList<>();
		List<Staff> availableStaffs = getAvailableCampaignStaffs(notAvailableStaffs);
		String choice;
		if(availableStaffs.size()==0) {
			System.out.println("every campaign staff is already working on this campaign");
			return;
		}else {
			
					
			do {
				System.out.println("select a campaign staff to assign to this campaign");
				for (Staff staff : availableStaffs) {
					System.out.println("(" + staff.getId() + ")" + staff.getName());
					
				}
				
				CampaignStaff selectedcampaignStaff = (CampaignStaff) getSelectedCampaignStaff(scanner.nextInt());
				System.out.println(selectedcampaignStaff.getName() + " is selected");
				selectedCampaignStaffs.add(selectedcampaignStaff);
				availableStaffs.removeAll(selectedCampaignStaffs);
				for (Staff staff : selectedCampaignStaffs) {
					System.out.println(staff.getName());
				}
				
			
				System.out.println("do you want to continue selecting staffs to this campaign? (y/N) " );
			
				choice = scanner.next();
				
				
				if (choice.equals("N")) {
					break;
				}
				
				
				
			} while (availableStaffs.size() > 0);
			
			
		}
		
		if (!choice.equals("N")) {
			System.out.println("you selected everyone");

		}
				
		for (Staff campaignStaff : selectedCampaignStaffs) {
			selectedCampaign.getCampaignStaffs().add(campaignStaff);
			System.out.println(campaignStaff.getName() + "has been assigned");
		}
				
	}
	
	//3
	public void assignAStaffContact() {
		
		System.out.println("*** assign a staff contact page***");
		
		System.out.println("------------------------------------------------");

		System.out.println("choose a client that you want to assign a contact");
		
		for (Client client : clientRepository.getAll()) {
			System.out.println( "(" + client.getId()  + ") "  + client.getCompanyName() );
		}
		
		Client client = getSelectedClient(scanner.nextInt());
		
		System.out.println("choose a staff to assign this client as a contact");
		
		for (Staff staff : staffRepository.getAllStaffContacts()) {
			System.out.println("("+ staff.getId() + ") " + staff.getName());
		}
		
		Staff staffContact = getSelectedContactStaff(scanner.nextInt());
		System.out.println(staffContact.getName());
		
		client.setContact(staffContact);
		System.out.println(client.toString());
		
		
		System.out.println("------------------------------------------------");
	
	}
	
	public void showAllClients() {
		
		System.out.println("CLIENTS LIST");
		for (Client client : clientRepository.getAll()) {
			System.out.println(client.toString());
		}
		
		
	}
	
	public Client getSelectedClient(int id) {	
		return clientRepository.getById(id);
	}
	
	public Staff getSelectedContactStaff(int id) {
		return staffRepository.getById(id);
	}
	
	public Campaign getSelectedCampaign(int id) {
		return campaignRepository.getById(id);
	}
	
	public List<Staff> getAvailableCampaignStaffs(List<Integer> ids){
		
		System.out.println("getting available campaign staffs...");
		
		return staffRepository.getAvailableCampaignStaffs(ids);
	}
	
	public Staff getSelectedCampaignStaff(int id) {
		return staffRepository.getById(id);
	}
	
	public void showAllCampaigns() {
		System.out.println("CAMPAIGNS LIST");
		System.out.println("------------------------------------------------");
		for (Campaign campaign : campaignRepository.getAll()) {
			System.out.println(campaign.toString());
		}
		
		System.out.println("------------------------------------------------");

	}
	
	
}
	
	
	
	
	