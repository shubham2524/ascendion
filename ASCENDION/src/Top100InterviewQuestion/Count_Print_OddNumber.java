package Top100InterviewQuestion;
//wap to print and count  all odd number between 0 to 100
public class Count_Print_OddNumber {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0;i<100;i++) {
			if(i%2 != 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total odd number "+count);
	

	}

}
