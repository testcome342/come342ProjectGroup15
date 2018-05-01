package fakedb;

import java.util.ArrayList;
import java.util.List;

import entities.Campaign;
import entities.Client;
import entities.StaffContact;
import repositories.CampaignRepository;
import repositories.StaffRepository;

public class ClientsTable implements ITable<Client> {

	private List<Client> clients;
	private StaffRepository staffRepository;
	
	public ClientsTable() {
		
		clients = new ArrayList<Client>();
		staffRepository = new StaffRepository();
		
		
		
		
		Client client1 = new Client(1, "adidas", "usa", "adidas", (StaffContact) staffRepository.getById(4) , null);
		Client client2 = new Client(2, "nike", "usa", "nike", null, null);
		Client client3 = new Client(3, "apple", "usa", "apple", null, null);
		Client client4 = new Client(4, "microsoft", "usa", "microsoft", (StaffContact) staffRepository.getById(5) , null);
		Client client5 = new Client(5, "linkin park", "usa", "linkinpark", null, null);
		Client client6 = new Client(6, "doğuş üniversitesi", "ist", "dogus", null,  null );
		
		this.clients.add(client1);		
		this.clients.add(client2);
		this.clients.add(client3);
		this.clients.add(client4);
		this.clients.add(client5);
		this.clients.add(client6);

	}

	@Override
	public List<Client> getAll() {
		return this.clients;
	}

	@Override
	public void save(Client client) {
		this.clients.add(client);
		
	}

	
	
}
