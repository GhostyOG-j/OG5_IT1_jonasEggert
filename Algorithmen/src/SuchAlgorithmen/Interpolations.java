package SuchAlgorithmen;

import java.util.Random;

public class Interpolations {

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
			final int ANZAHL = 15000000; // 20.000.000

			long[] a = getSortedList(ANZAHL);
			long gesuchteZahl = 19000000;
			System.out.println("Die gesuchte Zahl ist " + gesuchteZahl);

			long startZeit = System.nanoTime();

			int links = 0;
			int rechts = a.length - 1;
			boolean gefunden = false;
			int trefferIndex = -1;

			while (links <= rechts && gesuchteZahl >= a[links] && gesuchteZahl <= a[rechts]) {
				if (a[rechts] == a[links]) {
					if (a[links] == gesuchteZahl) {
						trefferIndex = links;
						gefunden = true;
					}
					break;
				}

				int pos = links + (int) (((double) (gesuchteZahl - a[links]) / (a[rechts] - a[links])) * (rechts - links));

				if (pos < links) {
					pos = links;
				} else if (pos > rechts) {
					pos = rechts;
				}

				if (a[pos] == gesuchteZahl) {
					trefferIndex = pos;
					gefunden = true;
					break;
				} else if (a[pos] < gesuchteZahl) {
					links = pos + 1;
				} else {
					rechts = pos - 1;
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
