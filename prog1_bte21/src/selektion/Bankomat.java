package selektion;

import java.util.Scanner;

public class Bankomat {

	public static void main(String[] args) {

		int saldo = 10000;

		Scanner input = new Scanner(System.in);

		System.out.println("1:uttag \n2:insättning \n3:saldo");

		int val = input.nextInt();

		switch (val) {

		case 1:
			System.out.println("hur mycket vill du ta ut");
			int uttagsbelopp = input.nextInt();

			if (uttagsbelopp <= saldo) {

				if (uttagsbelopp % 100 == 0) {

					System.out.println("du får " + (uttagsbelopp / 100) + " hundralappar");
					saldo=saldo-uttagsbelopp;
				} else {

					int hundralappar = (int) ((uttagsbelopp / 100.0) + 1); // 7,53

					saldo = saldo - uttagsbelopp;
					System.out.println("du får " +hundralappar+" hundralappar");
				}

			} else {
				System.out.println("du har inte tillräckligt på ditt konto saldo="+saldo);
			}

			break;

		}

	}

}
