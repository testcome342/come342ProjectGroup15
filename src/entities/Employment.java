package entities;

public class Employment {

	private int id;
	private Staff staff;
	private Grade grade;
	public Employment() {
		super();
	}
	public Employment(int id, Staff staff, Grade grade) {
		super();
		this.id = id;
		this.staff = staff;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
	
}
