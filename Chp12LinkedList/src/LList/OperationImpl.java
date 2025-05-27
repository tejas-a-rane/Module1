package LList;

import java.util.LinkedList;
import java.util.ListIterator;

public class OperationImpl implements Operation {
	
	LinkedList< EmpPojo> db = new LinkedList<EmpPojo>();
	
	
	@Override
	public void delete(int id) {
		ListIterator<EmpPojo> iterator = db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				iterator.remove();
			}
			
		}
	}

	@Override
	public void insert(LinkedList<EmpPojo> list) {
		db.addAll(list);
		System.out.println("data added");
	}

	@Override
	public void search(int id) {
		ListIterator<EmpPojo> iterator = db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				System.out.println(empPojo);
			}
		}

	}

	@Override
	public void show() {
		ListIterator<EmpPojo> iterator =db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}

	}

	@Override
	public void update(int id, String name) {
		ListIterator<EmpPojo> iterator = db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				empPojo.setName(name);
				
			}
		}

	}
}
