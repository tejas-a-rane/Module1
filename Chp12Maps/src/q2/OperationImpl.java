package q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OperationImpl implements Operations {

	Map<Integer, String> map = new HashMap<Integer, String>();

	@Override
	public void delete(int id) {
		map.remove(id);

	}

	@Override
	public void insert(Map<Integer, String> map1) {
		map.putAll(map1);

	}

	@Override
	public void search(int id) {
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			if (entry.getKey() == id) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}

	}

	@Override
	public void show() {
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	@Override
	public void update(int id, String name) {
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			if (entry.getKey() == id) {
				entry.setValue(name);
			}

		}

	}
}
