package ovn;

import javax.swing.JOptionPane;

public class Ovn76 {

	public static void main(String[] args) {
		
		
		 String sAntal = JOptionPane.showInputDialog("ange antal skivor");
			
		 int antal= Integer.parseInt(sAntal);
		 double pris=10;
		
		 if (antal >10 && antal<=50) {
			 
			 pris= pris*0.95*antal;
		 }else if( antal>50 && antal<101) {
			 
			 pris= pris*0.90*antal;
			 
		 }else if (antal>100){
			 
			 pris = pris*0.85 *antal;
			 
		 }else {
			 
			 pris=pris*antal;
		 }
		 
		 
		
		 
		 
		 
		 
		 
		 System.out.print("priset blir" +pris+ "kr för "+antal+"st skivor");
		 
	}
	
	
	
}
