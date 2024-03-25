package importantQuestionInfosys;

public class CountNoOfVowels {

	public static void main(String[] args) {
		
		String s = "fghjkaeiou l";
		String vowels = "aeiou";
		int count = 0;
		
		for(int i = 0;i <s.length();i++) {
			for(int j = 0;j< vowels.length();j++) {
				if (s.charAt(i)== vowels.charAt(j)) {
					count++;
				}
				
			}
			
		}
		System.out.println(count);

	}

}
