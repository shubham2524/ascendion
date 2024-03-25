package Top100InterviewQuestion;

import java.util.Scanner;

//wap to sum of all even and odd digits in Given number
public class Sum_odd_Even_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int evensum = 0;
		int oddSum = 0;
		int digit;

		while (num > 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				evensum = evensum + digit;
			} else {
				oddSum =oddSum+digit;

			}
			num = num / 10;

		}
		System.out.println(evensum);
		System.out.println(oddSum);

	}

}
