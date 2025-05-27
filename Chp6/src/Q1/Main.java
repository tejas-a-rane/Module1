package Q1;

interface Work {
	void Task();

	void No_of_Hours();
}

class Employee implements Work{
	@Override
	public void No_of_Hours() {
		// TODO Auto-generated method stub
		System.out.println("5 hours");
	}
	@Override
	public void Task() {
		System.out.println("Study");
	}
}

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.No_of_Hours();
	employee.Task();
}
}
