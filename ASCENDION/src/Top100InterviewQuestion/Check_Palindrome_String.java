package Top100InterviewQuestion;

import java.util.Scanner;

//Wap a program to check given string is palindrome or not
public class Check_Palindrome_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String original_s = sc.nextLine();
		
		String s = original_s;
		String rev_s ="";
		for(int i = s.length()-1;i>=0;i--) {
			rev_s = rev_s+s.charAt(i);
		}
		if (original_s.equals(rev_s)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrom");
		}
		
		

	}

}
