package Q4;

public class Pojo {
	private String name;
	private double sal;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		pojo.setId(1);
		pojo.setName("tejas");
		pojo.setSal(100000);
		System.out.println(pojo.getId()+" "+pojo.getName()+" "+pojo.getSal());
	}
	
}
