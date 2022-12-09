package arr;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;

public class Arrtest1 {

	public static void main(String[] args) {
		String s=Calendar.getInstance().getTime().toString();
		
		s=s.toLowerCase();
		s=s.substring(6,12);
		System.out.println(s);		
				
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i;
			System.out.println(Arrays.toString(arr));
		}

	}

}
