package LList;

import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	OperationImpl impl = new OperationImpl();
	LinkedList<EmpPojo> list = new LinkedList<EmpPojo>();
	
	EmpPojo empPojo1 = new EmpPojo();
	EmpPojo empPojo2 = new EmpPojo();
	EmpPojo empPojo3 = new EmpPojo();
	EmpPojo empPojo4 = new EmpPojo();
	
	empPojo1.setName("tejas");
	empPojo2.setName("shinde");
	empPojo3.setName("soham");
	empPojo4.setName("kevil");
	
	empPojo1.setId(1);
	empPojo2.setId(2);
	empPojo3.setId(3);
	empPojo4.setId(4);
	
	empPojo1.setAddress("Borivali");
	empPojo1.setAddress("gorai");
	empPojo1.setAddress("vazira");
	empPojo1.setAddress("mira");
	
	
	list.add(empPojo1);
	list.add(empPojo2);
	list.add(empPojo3);
	list.add(empPojo4);
	
	impl.insert(list);
	impl.show();
	System.out.println("---------------");
	impl.update(1,"teju");
	impl.show();
	System.out.println("----------------");
	impl.delete(3);
	impl.show();
	System.out.println("----------------");
	impl.search(1);
	
	
	
}
}
