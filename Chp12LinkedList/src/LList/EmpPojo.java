package LList;

public class EmpPojo {
	private String name;
	private String address;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmpPojo [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
}
