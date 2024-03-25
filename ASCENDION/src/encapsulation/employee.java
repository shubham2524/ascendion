package encapsulation;

public class employee {
	
	private int id;
	private String name;
	private int salary;
	
	
	public void Setid(int id) {
		this.id = id;
	}
	
	public int getid() {
		return id;
	}

	public void setname(String name ) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setsalary(int salary) {
		this.salary =salary;
	}
	public int getsalary() {
		return salary;
	}
	
}
