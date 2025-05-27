package clone;

class Emp implements Cloneable {
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("tejas", 1, "borivali");

		try {
			Emp empclone = (Emp) emp.clone();
			System.out.println(empclone);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
