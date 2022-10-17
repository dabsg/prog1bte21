package prog1_bte21;

import javax.swing.JOptionPane;

public class Stringtoint {

	public static void main(String[] args) {

		
		String stringtal1=JOptionPane.showInputDialog("ange ett tal");
		
		
		String stringtal2=JOptionPane.showInputDialog("ange ett tal till");
		
		int tal1=Integer.parseInt(stringtal1);
		
		double tal2=Double.parseDouble(stringtal2);
		
		
		double summa = tal1+tal2;
		
		JOptionPane.showMessageDialog(null, summa);
		
	}

}
