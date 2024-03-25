package Top100InterviewQuestion;

import java.util.Scanner;

public class factorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		int fact = 1 ;
		//Using while loop
		while(num>0) {
			fact = fact*num;
			num--;
		}
		System.out.println(fact);
		//using forloop
		for(int i = num;i>0;i--) {
			fact = fact*i;
			
			
		}
		System.out.println(fact);
	}

}
