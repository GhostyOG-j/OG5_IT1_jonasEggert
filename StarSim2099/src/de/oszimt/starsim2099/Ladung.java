package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	// Attribute
	double posX;
	double posY;
	int masse;
	String typ;
	// Methoden
	public Ladung() {
		
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

	public int getMasse() {
		return masse;
	}

	public void setMasse(int masse) {
		this.masse = masse;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}