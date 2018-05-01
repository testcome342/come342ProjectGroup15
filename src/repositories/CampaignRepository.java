package repositories;

import java.util.List;

import entities.Campaign;
import fakedb.CampaignsTable;

public class CampaignRepository implements IRepository<Campaign>{
	

	private CampaignsTable campaignsTable;
	
	public CampaignRepository() {
		campaignsTable = new CampaignsTable();
	}

	@Override
	public Campaign getById(int id) {	
		for (Campaign campaign : campaignsTable.getAll()) {
			if(campaign.getId() == id) {
				return campaign;
			}
		}		
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		return campaignsTable.getAll();
	}

	@Override
	public void Add(Campaign campaign) {
		campaignsTable.save(campaign);
		
	}

}
