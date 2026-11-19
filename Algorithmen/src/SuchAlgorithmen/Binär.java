package SuchAlgorithmen;

import java.util.Random;

public class Binär {

	public static class SortedListGenerator {

		public static long[] getSortedList(int laenge) {
			Random rand = new Random(111111);
			long[] zahlenliste = new long[laenge];
			long naechsteZahl = 0;

			for (int i = 0; i < laenge; i++) {
				naechsteZahl += rand.nextInt(3) + 1;
				zahlenliste[i] = naechsteZahl;
			}

			return zahlenliste;
		}

		public static void main(String[] args) {
			final int ANZAHL = 20000000; // 20.000.000

			long[] a = getSortedList(ANZAHL);
			long gesuchteZahl = 1000000;
			System.out.println("Die gesuchte zahl ist " + gesuchteZahl);
			long time = System.currentTimeMillis();

			boolean gefunden = false;		// variable initalisiert und declariert

			for (int i = 0; i < a.length; i++) {		// for schleife zum suchen der zahl
				if (a[i] == gesuchteZahl) {
					System.out.println("der Index Ist" + i);				//wenn zahl gefunden wird dann wird der Index ausgegebn
					gefunden = true;
					break;
				}
			}
			
			long dauer = System.currentTimeMillis() - time;
			
			if (!gefunden) {
				System.out.println("die zahl ist nicht vorhanden");
			}
			System.out.println("Es hat " + dauer + "ms gedauert");
			// for(long x: a)
			// System.out.println(x);

		}
	}
}
