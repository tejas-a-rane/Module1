package q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "tejas");
		map.put(2, "shinde");
		map.put(3, "soham");
		map.put(4, "kevil");

		/*
		 * System.out.println(map.keySet()); System.out.println(map.values());
		 * System.out.println(map.entrySet());
		 * 
		 * Set set = map.entrySet(); Iterator iterator = set.iterator(); while
		 * (iterator.hasNext()) { Map.Entry<Integer, String> entry =
		 * (Entry<Integer,String>)iterator.next();
		 * System.out.println(entry.getKey()+" "+entry.getValue());
		 * 
		 * 
		 */
		OperationImpl impl = new OperationImpl();
		impl.insert(map);
		impl.search(1);
		System.out.println("-----------------");
		impl.show();
		System.out.println("-----------------");
		impl.update(1, "teju");
		impl.show();
		System.out.println("-----------------");
		impl.delete(1);
		impl.show();

	}
}
