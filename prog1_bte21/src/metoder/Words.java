package metoder;

import javax.swing.JOptionPane;

public class Words {

	public static String buildSentens(int a, String[] ord) {

		String mening="";
		
		for (int i = 0; i < a; i++) {

			int slump = (int) (Math.random() * ord.length);
			
			mening = mening +" "+ ord[slump];
			
			//System.out.print(ord[slump]+" ");

			
			
		}
		return mening;
	}

	public static void main(String[] args) {

		String[] ord = { "är", "hund", "godis", "har", "mat", "eller", "åsna", "vart", "när" };

		String antalord = JOptionPane.showInputDialog("ange längd på mening");
		int antal = Integer.parseInt(antalord);

		String m=buildSentens(antal, ord);

		System.out.println(m);
		
	}

}
