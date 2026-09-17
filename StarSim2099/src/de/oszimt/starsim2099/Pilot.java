package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute
	String name;
	double posX;
	double posY;
	String grad;
	// Methoden
	public Pilot() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	
}
