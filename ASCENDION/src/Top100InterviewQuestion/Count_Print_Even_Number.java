package Top100InterviewQuestion;
//Wap to count and print even number between  1 to 100
public class Count_Print_Even_Number {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0;i<100;i++) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			
			
		}
		System.out.println("total number of even number :-"+count);
		

	}

}
