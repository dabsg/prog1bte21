package loops;

public class Wordmirror {
	public static void main(String[] args) {

		
		String s= "sirap";
		
		int längd =s.length();
		
		for (int i = längd-1; i >=0; i--) {
			
			System.out.print(s.charAt(i));
			
		}
		
	}
}
