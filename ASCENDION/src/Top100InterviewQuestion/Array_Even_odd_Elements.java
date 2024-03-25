package Top100InterviewQuestion;

//extract odd or even number from array
public class Array_Even_odd_Elements {

	public static void main(String[] args) {

		int oddcount = 0;
		int evencount = 0;

		int arr[] = { 3, 4, 7, 5, 6, 8, 3, 5, 67, 8 };
		System.out.println("even elements");
		for (int i = 0; i < arr.length; i++) {
			int arrayElmts = arr[i];

			if (arrayElmts % 2 == 0) {
				System.out.println(arrayElmts);
				evencount++;
			}

		}
		System.out.println("odd elements ");
		for (int i = 0; i < arr.length; i++) {
			int arrayElmts = arr[i];

			if (arrayElmts % 2 != 0) {
				System.out.println(arrayElmts);

			}
		}
	}

}
