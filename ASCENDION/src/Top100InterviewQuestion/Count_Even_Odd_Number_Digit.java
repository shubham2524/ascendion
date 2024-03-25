package Top100InterviewQuestion;

import java.util.Scanner;

//Wap to count even and odd number in a given digits
public class Count_Even_Odd_Number_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		int oddCount = 0;
		int EvenCount = 0;
		while (num>0) {
			int digit = num % 10;
			num = num/10;

			if (digit%2== 0) {
				EvenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("even count :-" + EvenCount);
		System.out.println("odd count:- " + oddCount);

	}

}
