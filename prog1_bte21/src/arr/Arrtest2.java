package arr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Arrtest2 {

	public static void main(String[] args) {

		int[] arr = new int[40];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.print("ange ett tal");
			arr[i] = sc.nextInt();
			System.out.println(Arrays.toString(arr));
		}

	}

}
