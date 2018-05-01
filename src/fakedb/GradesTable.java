package fakedb;

import java.util.ArrayList;
import java.util.List;

import entities.Grade;
import repositories.RateRepository;

public class GradesTable implements ITable<Grade> {

	private List<Grade> grades;
	private RateRepository rateRepository;
	
	
	public GradesTable() {
		this.grades = new ArrayList<Grade>();
		this.rateRepository = new RateRepository();
			
		Grade grade1 = new Grade(1, "Graphic Designer", rateRepository.getById(1));
		Grade grade2 = new Grade(2, "Copywriter", rateRepository.getById(2));
		Grade grade3 = new Grade(3, "Web Designer", rateRepository.getById(3));
		Grade grade4 = new Grade(4, "Photographer", rateRepository.getById(4));
			
		this.grades.add(grade1);
		this.grades.add(grade2);
		this.grades.add(grade3);
		this.grades.add(grade4);		
	}

	@Override
	public List<Grade> getAll() {		
		return this.grades;
	}

	@Override
	public void save(Grade grade) {
		this.grades.add(grade);
	}
	
		
}
