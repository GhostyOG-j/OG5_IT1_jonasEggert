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
	int maxLadekapazitaet;
	

	// Methoden
	public Raumschiff() {
		
	}
	
	public int getMaxLadekapazitaet() {
		return maxLadekapazitaet;
	}

	public void setMaxLadekapazitaet(int maxLadekapazitaet) {
		this.maxLadekapazitaet = maxLadekapazitaet;
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
