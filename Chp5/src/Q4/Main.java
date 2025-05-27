package Q4;

class Accounts {
	void calSal(double sal) {
		System.out.println(0);
	}

	void calSal(double sal, double tax) {
		System.out.println(0);
	}
}

class Employee extends Accounts {
	@Override
	void calSal(double sal) {
		// TODO Auto-generated method stub
		System.out.println(sal);
	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.calSal(100);
	}
}
