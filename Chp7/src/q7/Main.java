package q7;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Emp {
	public String name;
	public int id;
	public String addr;

	public Emp(String name, int id, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(addr);
	}

}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp("tejas", 1, "borivali");
	Method method[] =  emp.getClass().getMethods();
	Field field[] = emp.getClass().getFields();// fields kya hote hai????
	Constructor constructor[] = emp.getClass().getConstructors();
//	Parameter parameter[] = emp.getClass().getPara
	
	for(int i=0;i<constructor.length;i++) {
		System.out.println(constructor[i]);
	}
	System.out.println("-----------------------------------");
	for(int i = 0 ;i<method.length;i++) {
		System.out.println(method[i]);
	}
	System.out.println("-----------------------------------");
	for(int i=0;i<field.length;i++) {
		System.out.println(field[i]);
	}
	
}
}
