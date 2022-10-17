package arr;

import java.util.Arrays;

public class Arrswap {

	public static void main(String[] args) {
		
		int temp;
		int [] i = {4,5,7};
		
		
		temp=i[0];
		i[0]=i[2];
		i[2]=temp;
		System.out.println(Arrays.toString(i));
		
		
	}
	
}
