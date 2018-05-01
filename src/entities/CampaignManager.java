package entities;

import java.time.LocalDate;

import controllers.CampaignManagerController;

public class CampaignManager extends Staff {

	public CampaignManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampaignManager(int id, String name, String password, LocalDate startDate, String emailAddress,
			Grade grade) {
		super(id, name, password, startDate, emailAddress, grade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doJob() {
		CampaignManagerController campaignManagerController = new CampaignManagerController();
		campaignManagerController.welcome(this.getName());
		
	}
	
	
	

}
