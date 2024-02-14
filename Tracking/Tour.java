
public class Tour {


		private String ziel;
		private String datum = "1.1.2018";
				
		private int [] zeit = new int[5];
		private int [] hoehe = new int[5];
		private int x=1;
		
		
		public Tour(String ziel, int hoehe) {	//Konstruktor
			this.ziel = ziel;
			this.hoehe[0] = hoehe;
			
		}
			
		
		
		public void setZiel(String ziel) {		//Setter Methode Ziel
			this.ziel = ziel;
		}	
		
		
		public void setDatum(String datum) {	//Setter Methode Datum
			this.datum = datum;
		}	
		
		
		public String getZiel() {				//Getter Methode Ziel
			return ziel;
		}
			
		
		
			
		public String getDatum() {				//Getter Methode Datum
			return datum;
		}
		
			
		
//-------------------------------------------------------------------------------------------------------------
		
		
		
		
		public void print() {							//Print Methode
			System.out.println("Tour vom "+datum);
			System.out.println("Ziel: "+ziel);
			System.out.println("Ausgangshöhe: "+hoehe[0]);
			
			for (int i=0; i<zeit.length; i++) {
			System.out.println("Wegpunkt " +i+": " +zeit[i]+" min, " +hoehe[i]+" m");
			}
		}	
			
		public void saveWegpunkt(int wHoehe, int wZeit) {		//Wegpunkt speichern
			 
		hoehe[x] = wHoehe;
		zeit[x] = wZeit;
		x++;
		
		}

		
		
		
		
}