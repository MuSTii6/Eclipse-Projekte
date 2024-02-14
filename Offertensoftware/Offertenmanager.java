import java.util.HashMap;


public class Offertenmanager {

	private HashMap<Integer, Offerte> alleOfferten = new HashMap<>();
	private Kundenmanager kundenmanager;
	private int nextOffertenNummer = 1;
	

	public Offertenmanager(Kundenmanager k) {
			this.kundenmanager = k;
	}

	
	public void addOfferte(int kNummer, String beschreibung) {
		int oNumber = nextOffertenNummer++;
		Offerte o = new Offerte(kundenmanager.getKunde(kNummer), beschreibung, oNumber);
		alleOfferten.put(oNumber, o);

	}

	
	public Offerte getOfferte(int oNumber) {
			return alleOfferten.get(oNumber);

	}

	public void printAllOfferte() {
		for (int i = 1; i < nextOffertenNummer; i++) {
			System.out.println("-----------------------");
				System.out.print("Offerten-Nummer:" + getOfferte(i).getNummer());
					getOfferte(i).print();
		}
	}













}
