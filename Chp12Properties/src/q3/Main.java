package q3;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.put("tejas", "abc1");
		properties.put("shinde", "abc2");
		properties.put("arjun", "abc3");
		properties.put("soham", "abc4");

		Set set = properties.keySet();//idher key set!!!!!
		Iterator iterator = set.iterator();

		while (iterator.hasNext()){
			String string = (String) iterator.next();
			System.out.println(string + " " + properties.getProperty(string));
		}
		
		String string = properties.getProperty("kevil", "not found");
		System.out.println(string);
		String string2 = properties.getProperty("tejas", "not found");
		System.out.println(string2);

	}
}
