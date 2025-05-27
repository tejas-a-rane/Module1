package Arr;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<EmpPojo> list = new ArrayList<EmpPojo>();
			
		
		EmpPojo empPojo = new EmpPojo();
		empPojo.setName("tejas");
		empPojo.setId(1);
		empPojo.setAddress("borivali");
		
		EmpPojo empPojo2 = new EmpPojo();
		empPojo2.setName("shinde");
		empPojo2.setId(2);
		empPojo2.setAddress("gorai");
		

		EmpPojo empPojo3 = new EmpPojo();
		empPojo3.setName("soham");
		empPojo3.setId(3);
		empPojo3.setAddress("vazira");


		EmpPojo empPojo4 = new EmpPojo();
		empPojo4.setName("kevil");
		empPojo4.setId(4);
		empPojo4.setAddress("mira road");
		
		list.add(empPojo);
		list.add(empPojo2);
		list.add(empPojo3);
		list.add(empPojo4);
		
		System.out.println(empPojo);
		
		
		
		
		OperationImpl impl = new OperationImpl();
		impl.insert(list);
		impl.show();
		System.out.println("--------------------");
		
		impl.update(1, "teju");
		impl.show();
		System.out.println("--------------------");
		
		impl.delete(2);
		impl.show();
		System.out.println("--------------------");
		
		impl.search(3);
//		impl.show();
		System.out.println("--------------------");
		
	}
}
