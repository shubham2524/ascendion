package polymorphism;

class parent {
	public static void property() {
		System.out.println("parents property");
	}

}

class child extends parent {
	public static void property() {
		System.out.println("child property");
	}

}

public class runTimePolymorphism {

	public static void main(String[] args) {
		
		child c = new child();
		c.property();
		//upcasting
		parent p = new child();
		p.property();

	}

}
