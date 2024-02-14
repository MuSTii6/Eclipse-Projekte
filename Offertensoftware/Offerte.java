
public class Offerte {

	private String beschreibung;
	private double einkaufspreis;
	private String lieferzeit;
	private Kunde kunde;
	private int nummer;

	public Offerte(Kunde kunde, String beschreibung, int nummer) {
		this.kunde = kunde;
		this.beschreibung = beschreibung;
		this.nummer = nummer;
		einkaufspreis = 1.0;
		lieferzeit = "undefined";
	}

	public void setEinkaufspreis(double preis) {
		this.einkaufspreis = preis;
	}

	public void setLieferzeit(String lieferzeit) {
		this.lieferzeit = lieferzeit;
	}
	
	public int getNummer() {
		return nummer;
	}

	public void print() {
		this.kunde.print();
		System.out.println("Beschreibung: "+beschreibung);
		System.out.println("Einkaufspreis: "+einkaufspreis);
		System.out.println("Verkaufspreis: "+einkaufspreis*this.kunde.getMarge());
		System.out.println("Lieferzeit: "+lieferzeit);
	}
}



