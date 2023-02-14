package metoder;

import java.util.Arrays;

public class CallByReference {
	public static void main(String[] args) {


		int arr[] = {12,4,5,6,89,1};
		
		swapFirstAndLast(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void swapFirstAndLast(int[] arr2) {
		
		
		int temp = arr2[0];
		arr2[0]=arr2[arr2.length-1];
		arr2[arr2.length-1]=temp;
		
		
	}
}
