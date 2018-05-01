package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Accountant;
import entities.CampaignManager;
import entities.CampaignStaff;
import entities.Grade;
import entities.Staff;
import entities.StaffContact;

public class StaffTable implements ITable<Staff> {

	private List<Staff> staffs;

	public StaffTable() {
		staffs = new ArrayList<Staff>();
				
		//Creating some staff objects. I am going to use them as if they are coming from a database.
				
		
		Staff accountant1 = new Accountant(1, "selin", "asd", LocalDate.of(2015, 3, 6), "selin@mail.com", new Grade());

		Staff campaignManager1 = new CampaignManager(2, "mike", "asd", LocalDate.of(2016, 7, 8), "mike@mail.com", new Grade());		
		Staff campaignManager2 = new CampaignManager(3, "chester", "asd", LocalDate.of(2016, 7, 8), "chester@mail.com", new Grade());
				
		Staff staffContact1 = new StaffContact(4, "harold", "asd", LocalDate.of(2013, 4, 4) , "harold@mail", new Grade());		
		Staff staffContact2 = new StaffContact(5, "samantha", "asd", LocalDate.of(2013, 4, 4) , "samantha@mail", new Grade());
		Staff staffContact3 = new StaffContact(6, "dexter", "asd", LocalDate.of(2016, 4, 14) , "dexter@mail", new Grade());
				
		Staff campaignStaff1 = new CampaignStaff(7, "debra", "asd", LocalDate.of(2011, 2, 4), "debra@mail.com", new Grade());
		Staff campaignStaff2 = new CampaignStaff(8, "walter", "asd", LocalDate.of(2011, 2, 4), "walter@mail.com", new Grade());
		Staff campaignStaff3 = new CampaignStaff(9, "jessie", "asd", LocalDate.of(2011, 2, 4), "jessie@mail.com", new Grade());
		Staff campaignStaff4 = new CampaignStaff(10, "elliot	", "asd", LocalDate.of(2011, 2, 4), "elliot@mail.com", new Grade());
		Staff campaignStaff5 = new CampaignStaff(11, "albert	", "asd", LocalDate.of(2011, 2, 4), "albert@mail.com", new Grade());
		Staff campaignStaff6 = new CampaignStaff(12, "dolores	", "asd", LocalDate.of(2011, 2, 4), "dolores@mail.com", new Grade());
	
	
		this.staffs.add(accountant1);
		this.staffs.add(campaignManager1);
		this.staffs.add(campaignManager2);
		this.staffs.add(staffContact1);
		this.staffs.add(staffContact2);
		this.staffs.add(staffContact3);
		this.staffs.add(campaignStaff1);
		this.staffs.add(campaignStaff2);
		this.staffs.add(campaignStaff3);
		this.staffs.add(campaignStaff4);
		this.staffs.add(campaignStaff5);
		this.staffs.add(campaignStaff6);		
	}
	
	@Override
	public List<Staff> getAll() {
		return this.staffs;
		
	}


	@Override
	public void save(Staff staff) {
		this.staffs.add(staff);
		
	}

	
}
