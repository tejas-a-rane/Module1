package q2;

import java.util.Map;

interface Operations {
	void insert(Map<Integer, String> map);

	void update(int id,String name);

	void delete(int id);

	void search(int id);

	void show();
}
