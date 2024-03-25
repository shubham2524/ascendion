package importantQuestionInfosys;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "who are you";
		String[] sArr = s.split(" ");
		for (int i = sArr.length-1;i>=0;i--) {
			System.out.print(sArr[i]+" ");
		}
		
	}

}
