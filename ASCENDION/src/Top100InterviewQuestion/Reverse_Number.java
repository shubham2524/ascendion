package Top100InterviewQuestion;

import java.util.Scanner;

//WAP to reverse a number 
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int rev =0;
		while(num !=0) {
			rev = rev*10+ num%10;
			num = num/10;
		}
		System.out.println(rev);

	}
}
