package entities;

import java.time.LocalDate;
import java.util.Date;

import controllers.AccountantController;

public class Accountant extends Staff {

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountant(int id, String name, String password, LocalDate startDate, String emailAddress, Grade grade) {
		super(id, name, password, startDate, emailAddress, grade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doJob() {
		//feels terribly wrong to do
		AccountantController accountantController = new AccountantController();
		accountantController.welcome();
		
	}

	

	
	

}
