package Top100InterviewQuestion;

import java.util.Scanner;

//wap to check weather given number is even or not
public class CheckevenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your  number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is not even");
		}

	}

}
