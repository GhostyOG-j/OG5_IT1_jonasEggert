
public class Mitglied extends Mensch {
	private int telefonnummer;
	private Double jahresBeitrag;

	public Mitglied(String name,int telefonnummer, Double jahresBeitrag ) {
	super(name);	
		
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public Double getJahresBeitrag() {
		return jahresBeitrag;
	}

	public void setJahresBeitrag(Double jahresBeitrag) {
		this.jahresBeitrag = jahresBeitrag;
	}
	
}