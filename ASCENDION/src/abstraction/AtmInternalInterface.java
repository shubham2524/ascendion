package abstraction;

import java.util.Scanner;

public class AtmInternalInterface extends Atmuserinterface {
	
	private int balance = 5678;
	String username1 ="shubham";
	int password1 = 67890;

	@Override
	int checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username ");
		String username = sc.nextLine();
		if (username.equals(username1)) {
			System.out.println("enter password");
			int password = sc.nextInt();
			if (password == password1) {
				System.out.println(balance);

			} else {
				System.err.println("invalid password");
			}

		} else {
			System.err.println("invalid username");
		}

		return balance;
		
		
	}

	@Override
	void withdrawal(int a) {
	this.balance = balance-a;
	checkBalance();
		
		
	}

	@Override
	void deposite(int a) {
		this.balance = balance+a;
		checkBalance();
		
		
	}
	

	

}
