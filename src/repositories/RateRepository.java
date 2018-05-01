package repositories;

import java.util.List;

import entities.Rate;
import fakedb.RatesTable;

public class RateRepository implements IRepository<Rate> {
	
	private RatesTable ratesTable;
	
	public RateRepository() {
		ratesTable = new RatesTable();
	}

	@Override
	public Rate getById(int id) {
		
		for (Rate rate : ratesTable.getAll()) {
			if (rate.getId() == id) {
				return rate;
			}
		}
	
		return null;
	}

	@Override
	public List<Rate> getAll() {
		return this.ratesTable.getAll();
	}

	@Override
	public void Add(Rate rate) {
		this.ratesTable.save(rate);
		
	}
	
}
