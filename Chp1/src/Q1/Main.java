package Q1;

class Employee {
	String name;
	int id;
	double sal;
	String address;

	public Employee(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

}

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee("tejas", 1, 1000, "borivali");
	System.out.println(employee);
	employee.display();
}
}
