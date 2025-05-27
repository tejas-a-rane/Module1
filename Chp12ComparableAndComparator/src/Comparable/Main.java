package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Emp implements Comparable<Emp> {

	String name;
	int id;
	double salary;

	@Override
	public int compareTo(Emp o) {
		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		}
		return 0;
	}

	public Emp(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		ArrayList<Emp> arrayList = new ArrayList<Emp>();
		Emp emp = new Emp("tejas", 1, 10000);
		Emp emp2 = new Emp("arjun", 2, 100000);
		Emp emp3 = new Emp("shinde", 3, 1000000);
		arrayList.add(emp3);
		arrayList.add(emp2);
		arrayList.add(emp);

		System.out.println("before");
		Iterator<Emp> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Emp emp4 = (Emp) iterator.next();
			System.out.println(emp4);
		}
		
//		System.out.println("after");
		
//		Collections.sort(arrayList);
//		
//		Iterator<Emp> iterator1 = arrayList.iterator();
//		while (iterator1.hasNext()) {
//			Emp emp4 = (Emp) iterator1.next();
//			System.out.println(emp4);
//		}
		
		System.out.println("Comparator");
		Collections.sort(arrayList, new SalaryComp());
		Iterator<Emp> iterator3 = arrayList.iterator();
		while (iterator3.hasNext()) {
			Emp emp4 = (Emp) iterator3.next();
			System.out.println(emp4);
		}

	}

}
