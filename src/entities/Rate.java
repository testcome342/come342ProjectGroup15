package entities;

import java.util.Date;

public class Rate {
	
	private int id;
	private float rate;
	private Date startDate;
	private Date finishDate;
	public Rate() {
		super();
	}
	public Rate(int id, float rate, Date startDate, Date finishDate) {
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
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	

}
