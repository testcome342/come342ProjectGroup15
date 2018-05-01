package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Campaign;
import entities.CampaignStaff;
import entities.Staff;
import entities.StaffContact;
import repositories.ClientRepository;
import repositories.StaffRepository;

public class CampaignsTable implements ITable<Campaign>{
	
	private List<Campaign> campaigns;
	private ClientRepository clientRepository;
	private StaffRepository staffRepository;

	public CampaignsTable() {
		campaigns = new ArrayList<>();
		clientRepository = new ClientRepository();
		staffRepository = new StaffRepository();
		
		Campaign campaign1 = new Campaign(1, "adidas için kampanya 1",
				LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1), 34.456, 35.000, 
				clientRepository.getById(1), staffRepository.getAllCampaignStaffs());
		
				
		Campaign campaign2 = new Campaign(2, "adidas için kampanya 2",
				LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1), 34.456, 35.000, 
				clientRepository.getById(1), null);
		
		Campaign campaign3 = new Campaign(3, "adidas için kampanya 3", 
				LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1), 34.456, 35.000, 
				clientRepository.getById(1), null);

		
		List<Campaign> adidasCampaigns = new ArrayList<>();
		adidasCampaigns.add(campaign1);		
		adidasCampaigns.add(campaign2);
		adidasCampaigns.add(campaign3);	
		clientRepository.getById(1).setCampaigns(adidasCampaigns);
		
		
		Campaign campaign4 = new Campaign(4, "nike için kampanya 1", LocalDate.of(2016, 1, 1), 
				LocalDate.of(2016, 1,1 ), 34.456, 35.000, 
				clientRepository.getById(2), null);

		List<Campaign> nikeCampaigns = new ArrayList<>();
		nikeCampaigns.add(campaign4);
		clientRepository.getById(2).setCampaigns(nikeCampaigns);
		

		Campaign campaign5 = new Campaign(5, "doğuş için kampanya 1", LocalDate.of(2016, 1, 1),
				LocalDate.of(2016, 1, 1), 34.456, 35.000, 
				clientRepository.getById(6), null);
		Campaign campaign6 = new Campaign(6, "doğuş için kampanya 2", 
				LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1), 34.456, 35.000, 
				clientRepository.getById(6), null);
		

		//bu kampanyada çalışan staffları da ekliyorum 
		List<Staff> staffsForCampaign7 = new ArrayList<>();
		staffsForCampaign7.add(staffRepository.getById(8));
		staffsForCampaign7.add(staffRepository.getById(9));

	
		Campaign campaign7 = new Campaign(7, "doğuş için kampanya 4", LocalDate.of(2016, 1, 1), LocalDate.of(2016, 1, 1), 34.456, 35.000, clientRepository.getById(6),staffsForCampaign7);

		
		List<Campaign> dogusCampaigns = new ArrayList<>();
		dogusCampaigns.add(campaign5);
		dogusCampaigns.add(campaign6);
		dogusCampaigns.add(campaign7);
		clientRepository.getById(6).setCampaigns(dogusCampaigns);

		
		this.campaigns.add(campaign1);
		this.campaigns.add(campaign2);
		this.campaigns.add(campaign3);
		this.campaigns.add(campaign4);
		this.campaigns.add(campaign5);
		this.campaigns.add(campaign6);
		this.campaigns.add(campaign7);

		
		
	}
	
	
	@Override
	public List<Campaign> getAll() {
		
		return this.campaigns;
	}

	@Override
	public void save(Campaign campaign) {
		this.campaigns.remove(campaign);	
	}
	
}
