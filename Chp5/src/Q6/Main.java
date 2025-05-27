package Q6;

interface Rbi {
	void setRules(String s);
}

abstract class Bank implements Rbi {
	void BankMeths() {
		System.out.println("meths in bank");
	}
	abstract void getData();
	@Override
	public void setRules(String s) {
		System.out.println(s);
		
	}
}

class Customer extends Bank {
	void CustomerOps() {
		System.out.println("Customer ops");
	}
	@Override
	void getData() {
		System.out.println("Get Customer Details");
		
	}
	
}

class Company extends Bank {
	void CompnayOps() {
		System.out.println("Company ops");
	}
	@Override
	void getData() {
		System.out.println("Get Company Details");
		
	}
}

public class Main {
	public static void main(String[] args) {
		Company company = new Company();
		Customer customer = new Customer();
		
		company.getData();
		company.CompnayOps();
		System.out.println("-----------");
		customer.getData();
		customer.CustomerOps();
		System.out.println("-----------");
		company.BankMeths();
		customer.BankMeths();
		
	}
}
