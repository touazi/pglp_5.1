package uvsq.fr.gl_exo5;

public interface DAO<T> {
	T create(T obj);
	T find(String id);
	T update(T obj);
	void delete(T obj);
}
