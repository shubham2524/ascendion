package importantQuestionInfosys;

public class CountRepeatedChar {

	public static void main(String[] args) {
		String s = "shubhkamsks";
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(s.charAt(i)== s.charAt(j)) {
					count++;
				}
				
			}
		}
		System.out.println(count);
		
		
		

	}

}
