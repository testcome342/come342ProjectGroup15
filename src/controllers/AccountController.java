package controllers;

import entities.Staff;
import repositories.StaffRepository;
import views.Account.LogInView;

public class AccountController {

	private LogInView logInView;
	private StaffRepository staffRepository;
	
	public AccountController() {
		staffRepository = new StaffRepository();
	}
	
	//like get
	public void logIn() {
		logInView = new LogInView();
		logInView.welcome();
	}
	
	//like post
	public void logIn(String name, String password) {
		logInView = new LogInView();

		Staff staff = staffRepository.getByName(name);
		
		if (staff!=null) {
			if( staff.getPassword().equals(password) ) {
				System.out.println("here");
				staff.doJob();
				return;

			}
			else {
				logInView.error();
				return;

			}
		}
		logInView.error();
				
	}
	
	public void logOut() {
		logInView = new LogInView();
		logInView.welcome();
	}
	
	
	
	
	
	
}
