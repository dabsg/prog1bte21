package ovn;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ovn96 {

	public static void läsInTider(double[] t) {

		double in = -1;

		for (int i = 0; i < t.length && in != 0; i++) {

			String talString = JOptionPane.showInputDialog("ange ett tal eller 0 för att avsluta");
			in = Double.parseDouble(talString);
			t[i] = in;

		}

	}
	
	public static double snabbastTid(double [] t) {
		
		double minTid= Double.MAX_VALUE;
		
		for (int i = 0; i < t.length; i++) {
			
			if(t[i]<minTid && t[i]!=0) {
				
				minTid=t[i];
			}
			
		}
		
		return minTid;
	}
	
	

	public static void main(String[] args) {

		double[] tider = new double[100];

		läsInTider(tider);

		System.out.println(Arrays.toString(tider));

		double stid=snabbastTid(tider);
		System.out.println(stid);

	}

}
