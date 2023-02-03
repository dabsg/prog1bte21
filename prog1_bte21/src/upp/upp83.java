package upp;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class upp83 {
	public static void main(String[] args) {

		String antalstring=JOptionPane.showInputDialog("antal stjärnor per rad");
		int antal=Integer.parseInt(antalstring);
		
		
		
		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < antal; i++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
