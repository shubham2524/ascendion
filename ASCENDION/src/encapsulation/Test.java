package encapsulation;

public class Test extends employee {

	public static void main(String[] args) {
		
		employee e = new employee();
		e.Setid(567);
		System.out.println(e.getid());
		
		e.setname("shubham");
		System.out.println(e.getname());
		
		e.setsalary(456789);
		System.out.println(e.getsalary());
		
		
		
	}

}
