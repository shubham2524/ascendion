package Top100InterviewQuestion;

import java.util.Scanner;

public class Create_Array_User_data {
	
	public static void PrintArray(int a[]) {
		System.out.print("your array is :-{");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+",");
			
			
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array want to create");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("enter element");
			for(int i = 0;i<size;i++) {
				arr[i] =sc.nextInt();
			}
			PrintArray(arr);
			
		

	}

}
