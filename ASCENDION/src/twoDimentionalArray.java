import java.util.Arrays;

public class twoDimentionalArray {

	public static void main(String[] args) {
		
		int arr [] = {2,4,6};
		//System.out.println(arr.length);
		//System.out.println(arr[2]);
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.println(Arrays.toString(arr));
		int arr1 [] = new int[3];
		arr1[0] = 4;
		arr1[2] = 3;
		arr1[1] = 2;
		//System.out.println(arr1[2]);
		
		int arr2[][] = new int [2][2];
		arr2[0][0] = 5;
		arr2[0][1] = 6;
		arr2[1][0] = 7;
		arr2[1][1] = 8;
		
		//System.out.println(arr2.length);
		//System.out.print(arr2[0][1]);
		System.out.println(Arrays.deepToString(arr2));
		
		

	}

}
