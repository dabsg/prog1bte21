package upp;

import java.util.Arrays;
import java.util.Scanner;

public class upp31 {

	public static void main(String[] args) {
		
	double [] d= new double[3];	
		
	Scanner input =new Scanner(System.in);
	
	System.out.println("ange ett tal");
		
	d[0]= input.nextDouble();	
	System.out.println("ange ett tal");
	
	d[1]= input.nextDouble();	
			
	System.out.println("ange ett tal");
	
	d[2]= input.nextDouble();	
		
	double summa = d[0]+d[1]+d[2];
	
	double medel = summa/3;
	
	
	System.out.println("summan blir:"+summa+" medel blir:"+medel);
	
		
	}
	
}
