package entities;

import java.time.LocalDate;

public class StaffContact  extends Staff{

	public StaffContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaffContact(int id, String name, String password, LocalDate startDate, String emailAddress, Grade grade) {
		super(id, name, password, startDate, emailAddress, grade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		
	}

}
