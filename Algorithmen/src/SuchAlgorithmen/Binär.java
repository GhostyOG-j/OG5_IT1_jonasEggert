package SuchAlgorithmen;

import java.util.Random;

public class Binär {
	
	

	public static long[] getSortedList(int laenge){
		Random rand = new Random(111111);
		long[] zahlenliste = new long[laenge];
		long naechsteZahl = 0;
		
		
		
		return zahlenliste;
	}
	
	public static void main(String[] args){
		final int ANZAHL = 20000000; //20.000.000
		
		long[] a = getSortedList(ANZAHL);
		long gesuchteZahl = a[ANZAHL-1];
		
		long time = System.currentTimeMillis();
		
		for(int i = 0; i < a.length; i++)
			if(a[i] == gesuchteZahl)
				System.out.println(i);
		
		System.out.println(System.currentTimeMillis() - time + "ms");
		
		//for(long x: a)
		//	System.out.println(x);		
		
		int links = 0;
		int rechts = a.length - 1;
		int mitte;
		
		while (links <= rechts) {
			mitte = (rechts + links) / 2;
		}
		
		if(a[mitte] == gesuchteZahl) {
			// Zahl gefunden
			
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	

