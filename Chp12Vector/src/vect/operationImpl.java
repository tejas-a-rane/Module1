package vect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class operationImpl implements operation {

	Vector<EmpPojo> db = new Vector<EmpPojo>();

	@Override
	public void delete(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				iterator.remove();
			}
		}

	}

	@Override
	public void insert(Vector<EmpPojo> list) {
		db.addAll(list);
		System.out.println("inserted data");

	}

	@Override
	public void search(int id) {
		Enumeration<EmpPojo> enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId() == id) {
				System.out.println(empPojo);
			}
		}

	}

	@Override
	public void show() {
		Enumeration<EmpPojo> enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			System.out.println(empPojo);
		}

	}

	@Override
	public void update(int id, String name) {
		Enumeration<EmpPojo> enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId() == id) {
				empPojo.setName(name);
			}
		}

	}
}
