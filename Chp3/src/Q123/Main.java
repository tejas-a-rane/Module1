package Q123;

class Accounts {
	double calSal(double sal) {
		return 0;
	}

	double calSal(double sal, double tax) {
		return 0;
	}
}

class Employee extends Accounts {
	static String company;
	String name;
	int id;

	public Employee(String name, int id) {

		this.name = name;
		this.id = id;
	}

	static void displayCompany() {
		System.out.println(company);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	double calSal(double sal) {
		return sal;
	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("tejas", 9);
		Employee.company = "GDG";
		Employee.displayCompany();
		System.out.println(employee);
		System.out.println(employee.calSal(10000));
	}
}
