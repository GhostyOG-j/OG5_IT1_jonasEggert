package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	double posX;
	double posY;
	String typ;
	String antrieb;
	int winkel;
	// Methoden
	public Raumschiff() {
		
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

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getAntrieb() {
		return antrieb;
	}

	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}

	public int getWinkel() {
		return winkel;
	}

	public void setWinkel(int winkel) {
		this.winkel = winkel;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}
