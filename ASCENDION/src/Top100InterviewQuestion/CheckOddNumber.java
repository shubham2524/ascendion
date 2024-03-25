package Top100InterviewQuestion;

import java.util.Scanner;

//wap to check weather given number is odd or not
public class CheckOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();
		
			if(a%2!=0) {
				System.out.println("number is odd");
			}
			else {
				System.out.println("number is not odd");
			
		}
		

	}

}
