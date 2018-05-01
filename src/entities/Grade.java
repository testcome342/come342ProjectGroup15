package entities;

public class Grade {

	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", rate=" + rate + "]";
	}


	private int id;
	private String gradeName;
	private Rate rate;
	
	
	public Grade() {
		super();
	}


	public Grade(int id, String gradeName, Rate rate) {
		super();
		this.id = id;
		this.gradeName = gradeName;
		this.rate = rate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGradeName() {
		return gradeName;
	}


	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}


	public Rate getRate() {
		return rate;
	}


	public void setRate(Rate rate) {
		this.rate = rate;
	}
	
	
	
	
}
