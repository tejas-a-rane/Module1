package Q1;
class Work{
	String Task;
	String Task_hours;
	public Work(String task, String task_hours) {
	
		Task = task;
		Task_hours = task_hours;
	}
	@Override
	public String toString() {
		return "Work [Task=" + Task + ", Task_hours=" + Task_hours + "]";
	}
}
class Hobbies{
	
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
	Work work = new Work("study","5");
	Employee employee = new Employee("Tejas", 1, work, hobbies);
	System.out.println(employee);
}
}
