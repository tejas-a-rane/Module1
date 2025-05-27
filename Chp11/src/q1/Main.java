package q1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp {
	public String address;
	public String name;
	public int id;

	public Emp(String address, String name, int id) {
		super();
		this.address = address;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", name=" + name + ", id=" + id + "]";
	}

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("tejas", "Borivali", 1);
		Method method[] = emp.getClass().getMethods();
		Field field[] = emp.getClass().getFields();
		Constructor constructor[] = emp.getClass().getConstructors();

		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);
		}
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}

	}

}
