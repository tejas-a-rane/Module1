package q7;

interface HospitalOperations {
	void register();

	void generateReport();

	void updateRecord();

	void checkStatus();

	void processPayment();

}

abstract class Person {
	String name;
	int id;
	String contact;
	int age;
	String address;

	public Person(String name, int id, String contact, int age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.contact = contact;
		this.age = age;
		this.address = address;
	}

	public abstract void displayInfo();

}

class Patient extends Person implements HospitalOperations {
	public Patient(String name, int id, String contact, int age, String address) {
		super(name, id, contact, age, address);

	}

	@Override
	public void checkStatus() {
		System.out.println("Status");

	}

	@Override
	public void generateReport() {
		System.out.println("report generated");

	}

	@Override
	public void processPayment() {
		System.out.println("payment processed");

	}

	@Override
	public void register() {
		System.out.println("patient registered");
	}

	@Override
	public void updateRecord() {
		System.out.println("record updated");

	}

	@Override
	public void displayInfo() {
		System.out.println("info goes here");

	}

}

class Doctor extends Person implements HospitalOperations {
	public Doctor(String name, int id, String contact, int age, String address) {
		super(name, id, contact, age, address);
	}

	@Override
	public void checkStatus() {
		// TODO Auto-generated method stub
		System.out.println("status");
	}

	@Override
	public void displayInfo() {
		System.out.println("info goes here");

	}

	@Override
	public void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("doctor performance report");
	}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("doctor salary processed");
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("doctor registered");
	}

	@Override
	public void updateRecord() {
		// TODO Auto-generated method stub
		System.out.println("doctor record updated");
	}

}

public class Hospital {
	public static void main(String[] args) {
		Patient patient = new Patient("tejas", 1, "23456789", 20, "borivali");
		Doctor doctor = new Doctor("teju", 10, "2345678", 22, "gorai");
		patient.checkStatus();
		patient.displayInfo();
		patient.generateReport();
		patient.processPayment();
		patient.updateRecord();
		patient.register();

		doctor.checkStatus();
		doctor.displayInfo();
		doctor.generateReport();
		doctor.processPayment();
		doctor.updateRecord();
		doctor.register();

	}
}
