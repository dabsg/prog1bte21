package selektion;

import java.util.Iterator;
import java.util.Scanner;

public class Bankomat {

	public static void main(String[] args) {

		int saldo = 10000;

		Scanner input = new Scanner(System.in);

		int val = 2;

		do {
			System.out.println("1:uttag \n2:insättning \n3:saldo");

			val = input.nextInt();

			switch (val) {

			case 1:
				System.out.println("hur mycket vill du ta ut");
				int uttagsbelopp = input.nextInt();

				if (uttagsbelopp <= saldo) {

					if (uttagsbelopp % 100 == 0) {

						System.out.println("du får " + (uttagsbelopp / 100) + " hundralappar");
						saldo = saldo - uttagsbelopp;
					} else {

						int hundralappar = (int) ((uttagsbelopp / 100.0) + 1); // 7,53

						saldo = saldo - hundralappar*100;
						System.out.println("du får " + hundralappar + " hundralappar");
					}

				} else {
					System.out.println("du har inte tillräckligt på ditt konto saldo=" + saldo);
				}

				break;

			case 2:
				System.out.println("hur mycket vill du sätta in");
				int insättning = input.nextInt();
				saldo = saldo + insättning;
				// saldo+=insättning;
				break;

			case 3:

				System.out.println("saldo=" + saldo);
				break;

			default:
				System.out.println("avsluta");
				System.exit(0);

			}

		}while(val!=4);

	}
}
