package Top100InterviewQuestion;

import java.util.Scanner;

//largest digit in number
public class Largets_digit_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int digit = 0;
		int larDigit =0 ;
		
		while(num>0) {
			
			digit = num%10;
			if(digit >= larDigit) {
				larDigit =digit;
				
			}
			num = num/10;
			
			
		}
		System.out.println(larDigit);
		

	}

}
