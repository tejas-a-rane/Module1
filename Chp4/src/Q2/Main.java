package Q2;

class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		// super();
		this.name = name;
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Obj deleted");
	}

}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Tejas", 1);
		employee = null;
		System.gc();
	}
}
