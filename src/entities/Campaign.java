package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campaign {

	private int id;
	private String campaignTitle;
	private LocalDate startDate;
	private LocalDate finishDate;
	private double estimatedCost;
	private double overheads;
	private Client client;
	private List<Staff> campaignStaffs;
	
	
	
	public Campaign() {
		super();
		campaignStaffs = new ArrayList<>();

	}

	

	public String getCampaignTitle() {
		return campaignTitle;
	}



	public void setCampaignTitle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}



	public Campaign(int id, String campaignTitle, LocalDate startDate, LocalDate finishDate, double estimatedCost,
			double overheads, Client client, List<Staff> campaignStaffs) {
		super();
		this.id = id;
		this.campaignTitle = campaignTitle;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.estimatedCost = estimatedCost;
		this.overheads = overheads;
		this.client = client;
		this.campaignStaffs = campaignStaffs;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public double getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public double getOverheads() {
		return overheads;
	}

	public void setOverheads(double overheads) {
		this.overheads = overheads;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	public List<Staff> getCampaignStaffs() {
		return campaignStaffs;
	}



	public void setCampaignStaffs(List<Staff> campaignStaffs) {
		this.campaignStaffs = campaignStaffs;
	}



	@Override
	public String toString() {
		return "Campaign [id=" + id + ", campaignTitle=" + campaignTitle + ", startDate=" + startDate + ", finishDate="
				+ finishDate + ", estimatedCost=" + estimatedCost + ", overheads=" + overheads + ", client=" + client
				+ ", campaignStaffs=" + campaignStaffs + "]";
	}



	


	

	
}

