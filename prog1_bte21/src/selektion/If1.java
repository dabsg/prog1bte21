package selektion;

public class If1 {
	public static void main(String[] args) {

		double mittbetyg=15;
		
		
		if(mittbetyg==10) {
			
			System.out.println("du har betyget E");
		}else if(mittbetyg==12.5) {
		
			System.out.println("du har betyget D");
		}else  if(mittbetyg==15) {
			
			System.out.println("du har betyget C");
			
		}else if(mittbetyg==17.5) {
			
			System.out.println("du har betyget B");
			
		}else if(mittbetyg==20) {
			
			System.out.println("du har betyget A");
			
		}else {
			System.out.println("du har F");
			
		}
		
		
		
	}
}
