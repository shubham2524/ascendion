package inheritence;

public class Test {

	public static void main(String[] args) {
		
		childclass cc = new childclass();
		cc.Accountbal();
		cc.Property();
		cc.salary();
		cc.sheremarketBal();
		
		
		ParentClass pc = new ParentClass();
		pc.Accountbal();
		pc.Property();
		//pc.salary();
		
		GrandChild gc = new GrandChild();
		gc.Accountbal();
		cc.Property();
		
		gc.Bussinessincome();
		gc.bittening();

	}

}
