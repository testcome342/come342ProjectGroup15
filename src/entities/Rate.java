package entities;

import java.time.LocalDate;
import java.util.Date;

public class Rate {
	
	private int id;
	private double rate;
	private LocalDate startDate;
	private LocalDate finishDate;
	public Rate() {
		super();
	}
	public Rate(int id, double rate, LocalDate startDate, LocalDate finishDate) {
		super();
		this.id = id;
		this.rate = rate;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
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
	
	

}
