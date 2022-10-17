package prog1_bte21;

import javax.swing.JOptionPane;

public class Strings1 {

	public static void main (String [] arg) {
		
	String förnamn=JOptionPane.showInputDialog("ange ditt förnamn");
		
			
	int längd = förnamn.length();
	
	char tecken=förnamn.charAt(förnamn.length()-1);
	
	int pos = förnamn.lastIndexOf('a');
	
	
	
	System.out.println(förnamn +" " +längd+" "+tecken+" "+ pos);
		
	}
}
