package importantQuestionInfosys;
//number is same on reversing
public class palindrome {

	public static void main(String[] args) {
		int originalnum = 123223451;
		int num = originalnum;
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
			
		}
		System.out.println(rev);
		if(rev == originalnum) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
	}

}
