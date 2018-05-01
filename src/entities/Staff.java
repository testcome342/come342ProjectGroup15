package entities;

import java.time.LocalDate;


public abstract class Staff {

//	@Override
//	public String toString() {
//		return "Staff [id=" + id + ", name=" + name + ", password=" + password + ", startDate=" + startDate
//				+ ", emailAddress=" + emailAddress + ", grade=" + grade + "]";
//	}
	
	

	private int id;
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", password=" + password + ", startDate=" + startDate
				+ ", emailAddress=" + emailAddress + "]";
	}

	private String name;
	private String password;
	private LocalDate startDate;
	private String emailAddress;
	private Grade grade;
	
		
	public Staff() {
		super();
	}

	public Staff(int id, String name, String password, LocalDate startDate, String emailAddress, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.startDate = startDate;
		this.emailAddress = emailAddress;
		this.grade = grade;
	}
	
	public abstract void doJob();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
	
	

}
