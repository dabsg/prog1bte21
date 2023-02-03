package loops;

public class Rik {
	public static void main(String[] args) {

		int lön=1;
		int dagar=0;
		int saldo=0;
		
		while(saldo<1000000) {
			
			saldo+=lön;
			lön=lön*2;
			
			dagar++;
			
		}
		System.out.println("dagar:"+dagar);
		
	}
}
