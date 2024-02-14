
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	double fzA = 5; 				// Länge von deinem Auto (Meter)
	 double fzB = 15; 				// Länge des anderen Autos (Meter)
	 double vA = 80; 				// Deine Geschwindigkeit (km/h)
	 double vB = 70; 				// Geschwindigkeit des anderen Autos(km/h)
	 double s1 = vA/2; 				// Sicherheitsabstand 1
	 double s2 = vB/2; 				// Sicherheitsabstand 2
	 double rs = +fzA+s1+fzB+s2;	// Relative Strecke (Meter)
	 double gr = +vA-vB;			// Geschwindigkeit Relativ
	 double bz = (+rs*3.6)/gr;		// Benötigte Zeit
	 double uw = (bz*vA)/3.6;		// Ueberholweg
	 
	 
	 System.out.println("Geschwindigkeit A: "+vA);
	 System.out.println("Geschwindigkeit B: "+vB);
	 System.out.println("Länge A: "+fzA);
	 System.out.println("Länge B: "+fzB);

	 System.out.println("Sicherheitsabstand 1: " +s1);
	 System.out.println("Sicherheitsabstand 2: " +s2);
	 
	 System.out.println("Relative Strecke: " +rs+ " Meter");
	 System.out.println("Relative Geschwindigkeit: " +gr+ " km/h");
	 System.out.println("Benötigte Zeit: " +bz+ " Sekunden");
	 System.out.println("Ueberholweg: " +uw+ " Meter");
	 
	 
	}
	
	}
