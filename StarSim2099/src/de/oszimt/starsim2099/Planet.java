package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Himmelskoerper{

	// Attribute
	double posX;
	double posY;
	int anzahlHafen;
	
	// Methoden
	public Planet() {
		
	}
	
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posx) {
		this.posX = posx;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posy) {
		this.posY = posy;
	}

	public int getAnzahlHafen() {
		return anzahlHafen;
	}

	public void setAnzahlHafen(int anzahlHafen) {
		this.anzahlHafen = anzahlHafen;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
