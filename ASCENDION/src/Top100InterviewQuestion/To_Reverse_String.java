package Top100InterviewQuestion;

import java.util.Scanner;

//WAP to reverse String
public class  To_Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string you want to reverse");
		String s = sc.nextLine();
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
