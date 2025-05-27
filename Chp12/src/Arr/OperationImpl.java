package Arr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImpl implements Operation{
	ArrayList<EmpPojo> db = new ArrayList<EmpPojo>();
	@Override
	public void delete(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				iterator.remove();
			}
		}
		
	}
	@Override
	public void insert(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("inserted data");
		
	}
	@Override
	public void search(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				System.out.println(empPojo);
			}
		}
	}
	@Override
	public void show() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
			
		}
		
	}
	@Override
	public void update(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId()==id) {
				empPojo.setName(name);
			}
		}
		
	}

}
