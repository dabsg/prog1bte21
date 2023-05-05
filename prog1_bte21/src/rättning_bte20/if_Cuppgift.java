package rättning_bte20;


import java.util.Scanner;

public class if_Cuppgift {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Ange ett djur");
	String djur = scan.nextLine();
if (djur.equals("katt")){
		System.out.println("du har valt katt");
		
}else if(djur.equals("hund")){
	System.out.println("hunden är människans bästa vän");
}else{
	System.out.println("du gillar inte djur");

	}	
}
}

