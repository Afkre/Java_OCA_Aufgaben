import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		short eingabe;
		short ergebnis;
				
		// eingabe
		eingabe = e();
		
		// verarbeitung
		ergebnis = v(eingabe);
		
		// ausgabe
		a(ergebnis);
		
	}

	public static short e() {
		
		short eingabe = 12345; // 15
		System.out.println("Bitte einen Short-Wert eingeben:");
		eingabe = new Scanner(System.in).nextShort();

		return eingabe;
		
		
	}

	public static short v(short eingabe) {
				
		short zehntausender = (short) (eingabe / 10_000);
		short tausender = (short) ((eingabe - zehntausender * 10_000) / 1_000);
		short hunderter = (short) ((eingabe - zehntausender * 10_000 - tausender * 1_000) / 100);
		short zehner = (short) ((eingabe - zehntausender * 10_000 - tausender * 1_000 - hunderter * 100) / 10);
		short einer = (short) ((eingabe - zehntausender * 10_000 - tausender * 1_000 - hunderter * 100 - zehner * 10) / 1);

		System.out.print(zehntausender);
		System.out.print("+");
		System.out.print(tausender);
		System.out.print("+");
		System.out.print(hunderter);
		System.out.print("+");
		System.out.print(zehner);
		System.out.print("+");
		System.out.println(einer);

		short ergebnis = (short) (einer + zehner + hunderter + tausender + zehntausender);

		return ergebnis;
	}

	public static void a(short ergebnis) {
		System.out.println("Quersumme= " + ergebnis);
	}
}
