package Top100InterviewQuestion;

import java.util.Scanner;

//wap to count no of digits in a given number
public class count_digits_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("No of digits:-"+count);

	}

}
