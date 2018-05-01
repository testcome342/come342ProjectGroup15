package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Rate;

public class RatesTable implements ITable<Rate> {

	private List<Rate> rates;
	
	public RatesTable() {
		this.rates = new ArrayList<>();
		
		Rate rate1 = new Rate(1, 23.312, null, null);
		Rate rate2 = new Rate(2, 54.562, null, null);
		Rate rate3 = new Rate(3, 12.236, null, null);
		Rate rate4 = new Rate(4, 40.312, null, null);
		
		rates.add(rate1);
		rates.add(rate2);
		rates.add(rate3);
		rates.add(rate4);
		
	}

	@Override
	public List<Rate> getAll() {		
		return this.rates;
	}

	@Override
	public void save(Rate rate) {
		this.rates.add(rate);

	}
	
}
