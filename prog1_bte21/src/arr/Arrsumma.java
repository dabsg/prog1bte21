package arr;

import java.util.Arrays;

public class Arrsumma {
public static void main(String[] args) {
	
	
	int []summa = new int[10];

	int [] arr1= {1,2,3,4,5,6,7,8,9,10};
	int [] arr2= {10,9,8,7,6,5,4,3,2,1};
	
	
	for(int i=0;i<summa.length;i++) {
	
	summa[i]=arr1[i]+arr2[i];
	}
	
	System.out.println(Arrays.toString(summa));
	
}
}
