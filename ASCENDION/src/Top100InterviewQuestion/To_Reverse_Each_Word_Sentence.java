package Top100InterviewQuestion;

public class To_Reverse_Each_Word_Sentence {

	public static void main(String[] args) {
		String s = "my name is khan";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i>=0; i--) {
			System.out.print(s1[i]+" ");
		}

	}

}
