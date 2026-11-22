package SuchAlgorithmen;

import java.util.Random;

public class Linear {

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
			long gesuchteZahl = 20000000;
			System.out.println("Die gesuchte Zahl ist " + gesuchteZahl);

			long startZeit = System.nanoTime();

			boolean gefunden = false;
			int trefferIndex = -1;

			for (int i = 0; i < a.length; i++) {
				if (a[i] == gesuchteZahl) {
					trefferIndex = i;
					gefunden = true;
					break;
				}
			}

			double dauerMs = (System.nanoTime() - startZeit) / 1_000_000.0;

			if (gefunden) {
				System.out.println("Die Zahl wurde am Index " + trefferIndex + " gefunden.");
			} else {
				System.out.println("Die Zahl ist nicht vorhanden.");
			}

			System.out.println("Dauer: " + dauerMs + " ms");
		}
	}
}
