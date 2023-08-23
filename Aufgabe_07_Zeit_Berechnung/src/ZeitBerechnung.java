/*
import java.util.Scanner;

public class ZeitBerechnung {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Geben Sie die Anzahl von Sekunden ein: ");
        int gesamtSekunden = scanner.nextInt();
        
        berechneZeit(gesamtSekunden);
        
        scanner.close();
    }
    
    public static void berechneZeit(int gesamtSekunden) {
        int stunden = gesamtSekunden / 3600;
        int restSekunden = gesamtSekunden % 3600;
        
        int minuten = restSekunden / 60;
        int sekunden = restSekunden % 60;
        
        
        //System.out.println("Ausgabe:" + stunden + " Stunden, " + minuten + " Minuten, " + sekunden + " Sekunden" );
        
        
        System.out.println("Ausgabe:");
        System.out.println(stunden + " Stunden");
        System.out.println(minuten + " Minuten");
        System.out.println(sekunden + " Sekunden");
        
    }
}
*/

import javax.swing.JOptionPane;

public class ZeitBerechnung {
    public static void main(String[] args) {
        String sekundenEingabe = JOptionPane.showInputDialog("Geben Sie die Anzahl von Sekunden ein:");
        int gesamtSekunden = Integer.parseInt(sekundenEingabe);
        
        berechneZeit(gesamtSekunden);
    }
    
    public static void berechneZeit(int gesamtSekunden) {
        int stunden = gesamtSekunden / 3600;
        int restSekunden = gesamtSekunden % 3600;
        
        int minuten = restSekunden / 60;
        int sekunden = restSekunden % 60;
        /*
        String ausgabe = "Ausgabe:\n" +
                        stunden + " Stunden\n" +
                        minuten + " Minuten\n" +
                        sekunden + " Sekunden";
        */
        
        String ausgabe = "Ausgabe:\n" +
                stunden + " : " + minuten + " : " + sekunden ;
        
        JOptionPane.showMessageDialog(null, ausgabe);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeitBerechnung {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Geben Sie die Anzahl von Sekunden ein: ");
            String sekundenEingabe = reader.readLine();
            int gesamtSekunden = Integer.parseInt(sekundenEingabe);
            
            berechneZeit(gesamtSekunden);
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void berechneZeit(int gesamtSekunden) {
        int stunden = gesamtSekunden / 3600;
        int restSekunden = gesamtSekunden % 3600;
        
        int minuten = restSekunden / 60;
        int sekunden = restSekunden % 60;
        
        System.out.println("Ausgabe:");
        System.out.println(stunden + " Stunden");
        System.out.println(minuten + " Minuten");
        System.out.println(sekunden + " Sekunden");
    }
}

*/