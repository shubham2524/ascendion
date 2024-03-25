package Top100InterviewQuestion;

import java.util.Scanner;

//wap to count no of vowels in a given string
public class To_Count_Vowels_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		String s = sc.nextLine();
		String vowels = "aeiou";
		int count =0;
		
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<vowels.length();j++) {
				if(s.charAt(i)== vowels.charAt(j)) {
					count++;
				}
			}
			
		}
		System.out.println("no of vowels:-"+count);
		

	}

}
