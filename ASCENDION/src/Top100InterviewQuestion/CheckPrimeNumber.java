package Top100InterviewQuestion;

import java.util.Scanner;

//wap to print and count total prime numbers between 0 to 100
public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();

		int count = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {

				count++;
			}

		}
		if (count < 2) {
			System.out.println("number is prime");

		} else {
			System.out.println("number is  not prime");
		}

	}

}
