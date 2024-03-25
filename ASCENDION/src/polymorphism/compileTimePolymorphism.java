package polymorphism;
//method overloading is the example of compile time overloading
public class compileTimePolymorphism {
	
	public static void m1() {
		System.out.println("zero- argument");
	}
	public  static void m1(int a ) {
		System.out.println("single argument");
	}
	public  static void m1(int a,int b) {
		System.out.println("double argumnet");
	}

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		
		

	}

}
