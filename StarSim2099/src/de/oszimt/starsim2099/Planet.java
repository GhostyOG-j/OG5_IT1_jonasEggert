package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	double posX;
	double posY;
	int anzahlHafen;
	String name;
	// Methoden
	public Planet() {
		
	}
	
	public double getPosx() {
		return posX;
	}

	public void setPosx(double posx) {
		this.posX = posx;
	}

	public double getPosy() {
		return posY;
	}

	public void setPosy(double posy) {
		this.posY = posy;
	}

	public int getAnzahlHafen() {
		return anzahlHafen;
	}

	public void setAnzahlHafen(int anzahlHafen) {
		this.anzahlHafen = anzahlHafen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
