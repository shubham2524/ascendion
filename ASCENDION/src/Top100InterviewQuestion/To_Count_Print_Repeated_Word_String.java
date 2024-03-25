package Top100InterviewQuestion;

import java.util.Scanner;

public class To_Count_Print_Repeated_Word_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter words");
		String s = sc.nextLine();
		int count = 0;
		String rep = "";
		// s = shubhams;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					rep = rep + s.charAt(j);

				}
			}

		}
		System.out.println(count);
		System.out.println(rep);

	}

}
