package arr;

import java.util.Arrays;
import java.util.Iterator;

public class Arrtest1 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i;
			System.out.println(Arrays.toString(arr));
		}

	}

}
