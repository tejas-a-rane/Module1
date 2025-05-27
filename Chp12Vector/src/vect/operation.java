package vect;

import java.util.Vector;

public interface operation {
	void show();

	void update(int id, String name);

	void insert(Vector<EmpPojo> list);

	void search(int id);

	void delete(int id);
}
