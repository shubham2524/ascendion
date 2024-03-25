package Top100InterviewQuestion;

import java.util.Scanner;

//WAP to check number is palindrome or not
//123454321
public class Check_Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int original_num = sc.nextInt();
		
		int num = original_num;
		
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
			
		}
		System.out.println(rev);
		if(rev == num) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		

	}

}
