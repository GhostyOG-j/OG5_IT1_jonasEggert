package omnom;

public class Haustier {
	// Attribute
	int hunger;
	int muede;
	int zufrieden;
	int gesund;
	String name;

// Konstruktor
	public Haustier(String name) {
		this.gesund = 100;
		this.hunger = 100;
		this.muede = 100;
		this.zufrieden = 100;

	}
	// Getter und Setter

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = Math.max(0, Math.min(100, hunger));
	}

	public int getMuede() {
		return muede;
	}

	public void setMuede(int muede) {
		this.muede = Math.max(0, Math.min(100, hunger));
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public void setZufrieden(int zufrieden) {
		this.zufrieden = Math.max(0, Math.min(100, hunger));
	}

	public int getGesund() {
		return gesund;
	}

	public void setGesund(int gesund) {
		this.gesund = Math.max(0, Math.min(100, hunger));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Methoden
	public void fuettern(int wert) {
		setHunger(this.hunger + wert);
	}
	
	public void schlafen(int wert1) {
		setMuede(this.muede + wert1);
	}
	
	public void spielen(int wert2) {
		setZufrieden(this.zufrieden + wert2);
	}
	
	public void heilen() {
		setGesund(100);
	}
	
	
	
}
