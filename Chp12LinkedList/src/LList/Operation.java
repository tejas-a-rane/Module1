package LList;

import java.util.LinkedList;

public interface Operation {
	void insert(LinkedList<EmpPojo> list);

	void show();

	void delete(int id);

	void search(int id);

	void update(int id, String name);
}
