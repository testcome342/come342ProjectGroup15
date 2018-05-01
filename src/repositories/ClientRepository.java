package repositories;

import java.util.List;

import entities.Client;
import fakedb.ClientsTable;

public class ClientRepository implements IRepository<Client> {
	
	private ClientsTable clientsTable;
	
	public ClientRepository() {
		clientsTable = new ClientsTable();
	}
	

	@Override
	public Client getById(int id) {
		for (Client client : clientsTable.getAll()) {
			if(client.getId() == id) {				
				return client;
			}
		}		
		return null;
	}

	@Override
	public List<Client> getAll() {
		return clientsTable.getAll();
	}

	@Override
	public void Add(Client client) {
		clientsTable.save(client);
		
	}

}
