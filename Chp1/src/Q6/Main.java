package Q6;
class Hobbies{
	
}
class Work{
	String Task;
	String Work_hours;
	public Work(String task, String work_hours) {
		Task = task;
		Work_hours = work_hours;
	}
	@Override
	public String toString() {
		return "Work [Task=" + Task + ", Work_hours=" + Work_hours + "]";
	}
	
}
class Employee{
	String name;
	int id;
	Work work;
	Hobbies hobbies;
	
	public Employee(String name, int id, Work work, Hobbies hobbies) {
	
		this.name = name;
		this.id = id;
		this.work = work;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", work=" + work + ", hobbies=" + hobbies + "]";
	}
	
	
}

public class Main {
public static void main(String[] args) {
	Hobbies hobbies = new Hobbies();
	Work work = new Work("Study", "5");
	Employee employee = new Employee("tejas", 1, work, hobbies);
	System.out.println(employee);
}
}
