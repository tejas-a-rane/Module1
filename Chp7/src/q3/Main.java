package q3;

import java.util.Objects;

class Emp {
	String name;
	int id;
	String addr;

	public Emp(String name, int id, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(addr, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(addr, other.addr) && id == other.id && Objects.equals(name, other.name);
	}
	 @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("obejct deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("tejas", 1, "borivali");
		Emp emp1 = new Emp("tejas", 1, "borivali");
		System.out.println(emp.equals(emp1));
		System.out.println(emp);
		emp=null;
		System.gc();
		
		
		
	}
}









