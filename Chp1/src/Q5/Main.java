package Q5;

class Accounts {
	double calSal(double sal) {
		return sal;
	}

	double calSal(double sal, double tax) {
		return sal-tax;
	}
}

class Employee extends Accounts {
	@Override
	double calSal(double sal, double tax) {
		return sal - tax;
	}
}
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.calSal(100000));
		System.out.println(employee.calSal(100000, 1000));
	}

}
