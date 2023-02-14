package metoder;

public class Callbyvalue {

	public static void main(String[] args) {

		String s1 = "motor";
		String s2 = "båt";

		String sammanSkriven = skrivaIHop(s2, s1);
		System.out.println(sammanSkriven);

	}

	public static String skrivaIHop(String ord1, String ord2) {

		String svar =ord1 + ord2; 
		return svar;

	}

}
