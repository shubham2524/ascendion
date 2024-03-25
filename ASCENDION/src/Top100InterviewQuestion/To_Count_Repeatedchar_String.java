package Top100InterviewQuestion;

public class To_Count_Repeatedchar_String {

	public static void main(String[] args) {
		String s = "shubhamaurabh";
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
				}
				
			}
			
		}

	}

}
