package Top100InterviewQuestion;
//wap to count and print all prime numbers between 1 to 100
public class Count_Print_PrimeNumber {

	public static void main(String[] args) {
		for(int i = 1;i<=100;i++) {
			int count = 0;
			for(int j= 1;j<=i;j++) {
				if (i%j ==0) {
					count++;
					
				}
			}
			if (count==2) {
				System.out.println(i);
			}
		}
		
		
	}

}
