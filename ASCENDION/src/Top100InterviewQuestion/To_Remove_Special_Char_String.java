package Top100InterviewQuestion;

public class To_Remove_Special_Char_String {

	public static void main(String[] args) {
		String s = "shubham@#$%^&";
		String sN = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(sN);
	}

}
