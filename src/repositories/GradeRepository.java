package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Grade;
import fakedb.GradesTable;

public class GradeRepository implements IRepository<Grade> {
	

	private GradesTable gradesTable;
	
	public GradeRepository() {
		gradesTable = new GradesTable();
	}
		
	@Override
	public Grade getById(int id) {
		for (Grade grade : gradesTable.getAll()) {
			if (grade.getId() == id) {
				return grade;
			}
		}
		return null;
	}

	@Override
	public List<Grade> getAll() {
		return gradesTable.getAll();
	}

	@Override
	public void Add(Grade grade) {
		this.gradesTable.save(grade);		
	}
	
	public List<Grade> getAvailableGrades(int id) {
		
		List<Grade> availableGrades = getAll();
		Grade currentGrade = new Grade();
		
		for (Grade grade : availableGrades) {
			if(grade.getId() == id ) {
				currentGrade = grade;
			}
		}
		
		availableGrades.remove(currentGrade);
		
		return availableGrades;
		
	}
	
}
