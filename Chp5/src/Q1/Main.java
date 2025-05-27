package Q1;

class Manager {
	final void meth() {
		System.out.println("cannot be overriden");
	}
}

final class Employee extends Manager {
	final int company_employees = 10;
}
//class A extends Employee{
//	
//}

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	System.out.println(employee.company_employees);
	employee.meth();
}
}
