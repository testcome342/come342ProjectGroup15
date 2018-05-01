package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Accountant;
import entities.CampaignManager;
import entities.CampaignStaff;
import entities.Staff;
import entities.StaffContact;
import fakedb.StaffTable;

public class StaffRepository implements IRepository<Staff> {
		
	private StaffTable staffTable;

	public StaffRepository() {
		staffTable = new StaffTable();
	}

	@Override
	public Staff getById(int id) {
				
		for (Staff staff : staffTable.getAll()) {
			if(staff.getId() == id) {				
				return staff;
			}
		}
			
		return null;
	}

	@Override
	public List<Staff> getAll() {
		return staffTable.getAll();
	}

	@Override
	public void Add(Staff staff) {
		staffTable.save(staff);
	}
	
	
	public Staff getByName(String name) {		
		for (Staff staff : staffTable.getAll()) {
			if(staff.getName().equals(name)) {				
				return staff;
			}
		}
			
		return null;
	}
	
	
	public List<Staff> getAllAccountants(){
		
		List<Staff> accountants = new ArrayList<>();
		
		for (Staff staff : staffTable.getAll()) {
			
			if(staff instanceof Accountant) {
				accountants.add(staff);
			}
			
		}
				
		return accountants;		
	}
	
	
	public List<Staff> getAllCampaignManagers(){
		List<Staff> campaignManagers = new ArrayList<>();
		
		for (Staff staff : staffTable.getAll()) {
			
			if(staff instanceof CampaignManager) {
				campaignManagers.add(staff);
			}
			
		}
				
		return campaignManagers;
	}
	
	
	
	public List<Staff> getAllStaffContacts(){
		
		List<Staff> staffContacts = new ArrayList<>();
		
		for (Staff staff : staffTable.getAll()) {
			
			if(staff instanceof StaffContact) {
				staffContacts.add(staff);
			}
			
		}
				
		return staffContacts;
	}
	
	
	public List<Staff> getAllCampaignStaffs(){
		List<Staff> campaignStaffs = new ArrayList<>();
		
		for (Staff staff : staffTable.getAll()) {
			
			if(staff instanceof CampaignStaff) {
				campaignStaffs.add(staff);
			}
			
		}
				
		return campaignStaffs;
	}
	
	
	
	// a weird method 
	public List<Staff> getAvailableCampaignStaffs(List<Integer> ids){
		
		List<Staff> notAvailableStaffs = new ArrayList<>();
		List<Staff> availableStaffs = new ArrayList<>(); 
		
		availableStaffs = getAllCampaignStaffs();
		
		for (Staff staff : getAllCampaignStaffs()) {			
			for (Integer id : ids) {				
				if (staff.getId() == id) {					
					notAvailableStaffs.add(staff);
				}				
			}		
		}
		
		availableStaffs.removeAll(notAvailableStaffs);
				
		return availableStaffs;
	}
		
}
