import java.util.HashMap;

public class Kundenmanager {

	private HashMap<Integer, Kunde> alleKunden = new HashMap<Integer, Kunde>();

	private int nextKundenNummer = 100;

	public void addKunde(String name, String adresse, String uid) {

		if (uid != "") {
			alleKunden.put(nextKundenNummer, new Geschaeftskunde(name, adresse, nextKundenNummer, uid));
			nextKundenNummer++;
		} else {
			alleKunden.put(nextKundenNummer, new Privatkunde(name, adresse, nextKundenNummer));
			nextKundenNummer++;

		}
	}

	public Kunde getKunde(int kNumber) {
		if (alleKunden.containsKey(kNumber))
			;
		return alleKunden.get(kNumber);
	}

	public void printAllKunden() {
		for (Integer nextKundenNummer : alleKunden.keySet()) {
			Kunde k = alleKunden.get(nextKundenNummer);
			System.out.println("------------------");
			k.print();
		}
	}


}
