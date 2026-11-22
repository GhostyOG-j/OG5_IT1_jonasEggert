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
			final int ANZAHL = 20000000; // 20.000.000

			long[] a = getSortedList(ANZAHL);
			long gesuchteZahl = 1000000;
			System.out.println("Die gesuchte zahl ist " + gesuchteZahl);
			long time = System.currentTimeMillis();
			
			int links = 0;
			int rechts = a.length -1 ;
			boolean gefunden = false;
			
		while(links <= rechts && gesuchteZahl >= a[links] && gesuchteZahl <= a[rechts]) {
		if (a[rechts] == a[links]) {	
			if(a[links] == gesuchteZahl) {
			System.out.println("der Index ist " + links);
			gefunden = true; 
		}
		break;
		
		}
		
		int pos = links + (int) (((double)  (gesuchteZahl - a[links]) / (a[rechts]) - a[links])) * (rechts - links);
		if (pos < links) {
			pos = links;
		} 
		else if(pos > rechts) {
			pos = rechts;
		}
		
		if (a[pos] == gesuchteZahl) {
			
			System.out.println("der Index ist " + pos);
			gefunden = true;
		break ;
		}
		else if (a[pos] < gesuchteZahl) {
			links = pos + 1;
		}
		else {
			rechts = pos -1;
		}
	}
		
		
	}
	
	}
}
	
	

