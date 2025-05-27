package Arr;

import java.util.List;

public interface Operation {
	void insert(List<EmpPojo> list);

	void delete(int id);

	void update(int id, String name);

	void search(int id);

	void show();
}
