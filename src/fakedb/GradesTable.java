package fakedb;

import java.util.ArrayList;
import java.util.List;

import entities.Grade;

public class GradesTable implements ITable<Grade> {

	private List<Grade> grades;
	
	public GradesTable() {
		this.grades = new ArrayList<Grade>();
			
		Grade grade1 = new Grade(1, "Graphic Designer", null);
		Grade grade2 = new Grade(2, "Copywriter", null);
		Grade grade3 = new Grade(3, "Web Designer", null);
		Grade grade4 = new Grade(4, "Photographer", null);
			
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
