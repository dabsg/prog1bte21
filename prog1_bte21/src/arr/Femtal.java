package arr;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Femtal {
	public static void main(String[] args) {

		//skapa array med 5 pos int
		
		int []k= new int[5]; 
		
		
		for(int i =0; i<5;i++) { // loop som tar fem varv 0,1,2,3,4
			
			// läser in 1st "tal" i form av en string.
			String stringtal=JOptionPane.showInputDialog("ange ett tal");
			
			// omvandla strängen till int 
			k[i]=Integer.parseInt(stringtal);
		}
		
		
		//printar arrayen efter loopen
		System.out.println(Arrays.toString(k));
		
	}
}
