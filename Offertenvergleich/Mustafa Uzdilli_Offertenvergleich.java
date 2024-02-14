import java.util.Scanner;

public class Offertenvergleich {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		
			 double PreisA; // Preis Lieferant A
			 double PreisB; // Preis Lieferant B
			 int 	LzA; 	// Lieferzeit Lieferant A
			 int 	LzB; 	// Lieferzeit Lieferant B
			 
			// TODO: Implementation	 
			 
		
			 
			 System.out.print("Preis A: ");
			 	PreisA = keyScan.nextDouble();
			 System.out.print("Preis B: ");
			 	PreisB = keyScan.nextDouble();
			 System.out.print("Lieferzeit A: ");
			 	LzA = keyScan.nextInt();
			 System.out.print("Lieferzeit B: ");
			 	LzB = keyScan.nextInt();
			 
			 keyScan.close();
			 
			 System.out.println("A: "+PreisA+ " CHF, "+LzA+" Tage");
			 System.out.println("B: "+PreisB+ " CHF, "+LzB+" Tage");
			 
			 if (PreisA < PreisB && LzA <= 14 && LzB <= 14) {
				 System.out.println("Bei Lieferant A bestellen");

			 } else if (PreisA > PreisB && LzA <= 14 && LzB <= 14) {
				 System.out.println("Bei Lieferant B bestellen");

			 } else if (LzA > 14 && LzB <= 14) {
	             		System.out.println("Bei Lieferant B bestellen");

			 } else if (LzA > 14 && LzB > 14) {
	             		System.out.println("Nichts bestellen");

	         	if (PreisA == PreisB && LzA <= 14 && LzB <= 14)
	        	 	System.out.println("Lieferant selbst wählen"); 
	         
	 
	       
			 {
			 }
	         }
	}
	}

	
	