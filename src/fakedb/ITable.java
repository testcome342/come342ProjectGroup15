package fakedb;

import java.util.List;

public interface ITable<T> {

	
	public List<T> getAll();
	public void save(T t);
	
	
}
