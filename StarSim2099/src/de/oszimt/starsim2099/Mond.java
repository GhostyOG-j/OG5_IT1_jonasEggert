package de.oszimt.starsim2099;

public class Mond extends Himmelskoerper{

	private double posX;
	private double posY;
	
	private String Erzart;
	


	// Methoden
	public Mond() {
		
	}
	public double getPosX() {
		return posX;
	}


	public void setPosX(double posX) {
		this.posX = posX;
	}


	public double getPosY() {
		return posY;
	}


	public void setPosY(double posY) {
		this.posY = posY;
	}


	public String getErzart() {
		return Erzart;
	}


	public void setErzart(String erzart) {
		Erzart = erzart;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}