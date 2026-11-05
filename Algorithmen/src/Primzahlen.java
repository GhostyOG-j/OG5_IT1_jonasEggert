
import java.util.Scanner;

public class Primzahlen {

    public boolean isPrim(long zahl) {

        if (zahl <= 1) {
            return false;
        }

        if (zahl == 2) {
            return true;
        }

        if (zahl % 2 == 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(zahl); i += 2) {

            if (zahl % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie bitte Ihre Zahl ein: ");
        long scanzahl = scan.nextLong();

        Primzahlen p = new Primzahlen();

        // Timer starten
        long start = System.nanoTime();

        boolean ergebnis = p.isPrim(scanzahl);

        // Timer stoppen
        long ende = System.nanoTime();

        // Laufzeit berechnen
        long dauer = ende - start;

        if (ergebnis) {
            System.out.println(scanzahl + " ist eine Primzahl.");
        } else {
            System.out.println(scanzahl + " ist keine Primzahl.");
        }

        System.out.println("Benötigte Zeit: " + dauer + " Nanosekunden");
        System.out.println("Benötigte Zeit: " + (dauer / 1_000_000.0) + " Millisekunden");

        scan.close();
    }
}

