package Q5;
class Employee{
	static String Company;
	String name;
	double calSal(double sal) {
		return sal;
	}
}
public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	Employee.Company="GDG";
	employee.name="tejas";
	System.out.println(employee.calSal(10000));
	
}
}
