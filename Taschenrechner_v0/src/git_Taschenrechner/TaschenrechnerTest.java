package git_Taschenrechner;

import java.util.Scanner;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		Taschenrechner ts = new Taschenrechner();

		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Dividieren     |");
		System.out.println("|        4. Multiplikation |");
		System.out.println("|        5. Exit	   |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);

		if (swValue == '1' || swValue == '2' || swValue == '3' || swValue == '4') {
			System.out.println("Geben sie die erste Zahl ein.");
		double zahl1 = myScanner.nextDouble();
		System.out.println("Geben sie die zweite Zahl ein.");
		double zahl2 = myScanner.nextDouble();
		
		
		
		// Switch construct
		switch (swValue) {
		case '1':
			
			System.out.println( zahl1 + "+" + zahl2 + "=" + ts.add(zahl1, zahl2));
			break;
			
		case '2':
			
			System.out.println( zahl1 + "-" + zahl2 + "=" + ts.sub(zahl1, zahl2));
			break;
		 
			case '3':
				
				System.out.println( zahl1 + "/" + zahl2 + "=" + ts.div(zahl1, zahl2));
				break;
		  
				case '4':
				
				System.out.println( zahl1 + "*" + zahl2 + "=" + ts.mul(zahl1, zahl2));
				break;
				case '5':
					System.out.println("System Beenden");
					break;
		  
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary
		}
		}

	}
}

