package entities;

import java.time.LocalDate;

public class CampaignStaff extends Staff {

	public CampaignStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampaignStaff(int id, String name, String password, LocalDate startDate, String emailAddress, Grade grade) {
		super(id, name, password, startDate, emailAddress, grade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doJob() {
		// TODO Auto-generated method stub
		
	}

}
