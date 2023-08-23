import java.awt.*;
import java.awt.event.*;

class OlympischeRinge extends Frame {

	public static int durchmesser; // Field(Feld) oder auch class variable (Klassenvariable)

	public static void main(String[] args) {

		// args hier setzen, das erspart die Kommandozeilenübergabe
		args = new String[3];
		args[0] = "800"; // Breite des Fenster
		args[1] = "300"; // Höhe des Fensters
		args[2] = "200"; // Durchmesser aller Ringe

		int breite, hoehe;

		breite = Integer.parseInt(args[0]);
		hoehe = Integer.parseInt(args[1]);
		durchmesser = Integer.parseInt(args[2]);

		Frame f = new OlympischeRinge();
		f.setSize(breite, hoehe); // Fenster Breite und Höhe
		f.setTitle("Olympische Ringe"); // Fenster Titeltext
		f.setVisible(true); // Fenster anzeigens

		// Close Button gedrückt -> Programmende
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // sofortiges Programmende
			}
		});
	}

	public void paint(Graphics g) {
		// Die Ringe zeichnen
		g.setColor(Color.blue);
		g.drawOval(80, 80, durchmesser, durchmesser);

		g.setColor(Color.yellow);
		g.drawOval(105, 100, durchmesser, durchmesser);

		g.setColor(Color.black);
		g.drawOval(130, 80, durchmesser, durchmesser);

		g.setColor(Color.green);
		g.drawOval(155, 100, durchmesser, durchmesser);

		g.setColor(Color.red);
		g.drawOval(180, 80, durchmesser, durchmesser);

		// Untertitel
		g.drawString("Olympische Ringe", 110, 170);
	}

}
