package Q1;
class Employe{
	static String Company_name;
	static String Company_location;
	String name;
	int id;
	
	static void displayCompany() {
		System.out.println(Company_name);
		System.out.println(Company_location);
	}
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
	}
}

public class Q2 {
public static void main(String[] args) {
	Employe employee = new Employe();
	employee.name="Tejas";
	employee.id=1;
	Employe.Company_name="Sdac";
	Employe.Company_location="Borivali";
	
	Employe.displayCompany();
	employee.displayInfo();
}
}
