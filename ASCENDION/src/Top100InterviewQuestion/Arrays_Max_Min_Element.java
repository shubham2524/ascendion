package Top100InterviewQuestion;

public class Arrays_Max_Min_Element {

	public static void main(String[] args) {
	
	
	int [] arr = {2,4,6,7,2,8,1,2};
	int max = arr[0];
	int min = arr[0];
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]>= max) {
			max = arr[i];
		}
		else if (arr[i]<=min) {
			min = arr[i];
		}
	}
	
	System.out.println("max - "+max);
	System.out.println("min - "+min);

	}

}
