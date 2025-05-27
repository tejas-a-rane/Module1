package Consumer;

class Employee extends Accounts {
	@Override
	public double calSal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
}

class Manager extends Accounts {
	@Override
	public double calSal(double sal, double tax) {
		// TODO Auto-generated method stub
		return sal - tax;
	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.calSal(1000));
		Manager manager = new Manager();
		System.out.println(manager.calSal(10000, 100));
	}
}
