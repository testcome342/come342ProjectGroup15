package entities;

import java.util.List;

public class Client {

	private int id;
	private String companyName;
	private String companyAddress;
	private String companyEmail;
	private Staff contact;
	List<Campaign> campaigns;
	
	public Client() {
		super();
	}


	public Client(int id, String companyName, String companyAddress, String companyEmail, StaffContact contact,
			List<Campaign> campaigns) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail = companyEmail;
		this.contact = contact;
		this.campaigns = campaigns;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public Staff getContact() {
		return contact;
	}

	public void setContact(Staff contact) {
		this.contact = contact;
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyEmail=" + companyEmail + ", contact=" + contact + "]";
	}

	
	
	
	
	
	
	
	
	
}
