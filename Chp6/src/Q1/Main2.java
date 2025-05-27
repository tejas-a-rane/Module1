package Q1;
abstract class Company{
	abstract double calSal(double sal);
	void companyInfo() {
		System.out.println("Company name : GDG");
	}
}
class Employe extends Company{
	@Override
	double calSal(double sal) {
		
		return sal;
	}
}
public class Main2 {
public static void main(String[] args) {
	Employe employee = new Employe();
	employee.calSal(1000);
	employee.companyInfo();
}
}
