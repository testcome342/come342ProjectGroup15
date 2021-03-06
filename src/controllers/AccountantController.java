package controllers;

import java.util.Scanner;

import entities.Grade;
import entities.Rate;
import entities.Staff;
import repositories.GradeRepository;
import repositories.StaffRepository;


public class AccountantController {

	private Scanner scanner;
	private GradeRepository gradeRepository;
	private StaffRepository staffRepository;
	
	
	public AccountantController() {
		scanner = new Scanner(System.in);
		gradeRepository =  new GradeRepository();
		staffRepository = new StaffRepository();
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
			addANewStaffGrade();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 2:
			changeGradeOfAStaff();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions(); 
			selectAnOption();
			break;
			
		case 3:
			showAllTheGrades();
			System.out.println("press a key to redirect to home");
			scanner.next();
			showOptions();
			selectAnOption();
			break;
			
		case 4:
			showAllTheStaffs();
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
	
	public void showAllTheGrades() {
		System.out.println("Grades in the company:");
		
		for (Grade grade	 :  gradeRepository.getAll()) {
			System.out.println(grade.toString());
		}
		
	}
	
	
	public void showAllTheStaffs() {
			
		System.out.println("------------------------------------------------");

		System.out.println("ACCOUNTANTS");
		for (Staff staff : staffRepository.getAllAccountants()) {
			System.out.println(staff.getName());
			
		}
		
		System.out.println("------------");
		
		System.out.println("CAMPAIGN MANAGERS");
		for (Staff staff : staffRepository.getAllCampaignManagers()) {
			System.out.println(staff.getName());
		}
		
		System.out.println("------------");
		System.out.println("CAMPAIGN STAFFS");
		for (Staff staff : staffRepository.getAllCampaignStaffs()) {
			System.out.println(staff.getName() + " (" + staff.getGrade().getGradeName() + ")");
		}
		
		System.out.println("------------");
		System.out.println("CONTACT STAFFS FOR CLIENTS");
		for (Staff staff : staffRepository.getAllStaffContacts()) {
			System.out.println(staff.getName());
		}
		System.out.println("------------------------------------------------");

		
	}
	
	
	public void addANewStaffGrade() {
		
		System.out.println("*** Add new staff grade page ***");
		System.out.println("------------------------------------------------");

		
		Grade newGrade = new Grade();
		System.out.println("Please enter grade's: ");
		
		System.out.println("id:");
		newGrade.setId(scanner.nextInt());
		
		System.out.println("name:");
		newGrade.setGradeName(scanner.next());
		
		
		Rate rate = new Rate(6, 0.0, null, null);
		newGrade.setRate(rate);
		
		
		gradeRepository.Add(newGrade);
		
		System.out.println("The new grade has been saved successfully");
	
		System.out.println("------------------------------------------------");
		
	}
	
	public void changeGradeOfAStaff() {
		System.out.println("*** Change grade of a staff page ***");
		System.out.println("------------------------------------------------");
		
		System.out.println("choose a staff to change their grade");
		for (Staff staff : staffRepository.getAllCampaignStaffs()) {
			System.out.println( " (" + staff.getId() + ") " + staff.getName() + " (" + staff.getGrade().getGradeName() + ")" );
		}
		
		Staff selectedStaff =  getSelectedStaff(scanner.nextInt());
		
		System.out.println(selectedStaff.getName() + " is selected. This staff is a " + selectedStaff.getGrade().getGradeName() + " right now");
		
		System.out.println("choose a new grade to assign to " + selectedStaff.getName());
		for (Grade grade : gradeRepository.getAvailableGrades(selectedStaff.getGrade().getId())) {
			System.out.println("(" + grade.getId() + ") " + grade.getGradeName());
		}
				
		Grade selectedGrade = getSelectedGrade(scanner.nextInt());
		
		System.out.println(selectedGrade.getGradeName() + " is selected");
	
		selectedStaff.setGrade(selectedGrade);
		
		System.out.println(selectedStaff.getName() + " is now a " + selectedStaff.getGrade().getGradeName() );
		
		
		System.out.println("------------------------------------------------");

	}
	
	
	
	public Staff getSelectedStaff(int id) {		
		return staffRepository.getById(id) ;
	}
	
	public Grade getSelectedGrade(int id) {
		return gradeRepository.getById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
