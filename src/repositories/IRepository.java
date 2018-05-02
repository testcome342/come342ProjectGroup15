package repositories;

import java.util.List;

public interface IRepository<T> {

	public T getById(int id);
	public List<T> getAll();
	void Add(T t);	

}