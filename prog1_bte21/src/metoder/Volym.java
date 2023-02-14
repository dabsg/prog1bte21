package metoder;

public class Volym {

	public static int volymLitertoDec(int vl) {
		
		int vd=vl*10;
		
		return vd;
		
	}
	
	public static void printLiterPerqubic(){
		
		System.out.println("antal liter per kubik"+(10*10*10));
		
	}
	
	public static double volymPyramid(int sida, int höjd) {

		return (sida*höjd)/3.0;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		 int svar =volymLitertoDec(6);
		
		 System.out.println(svar);
		 
		 printLiterPerqubic();
		 
		 double volymP=volymPyramid(5, 5);
		 
		 System.out.println(volymP);
		 
		
	}
	
	
}
