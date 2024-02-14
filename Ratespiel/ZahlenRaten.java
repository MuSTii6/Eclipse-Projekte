	import java.util.Random;
	import java.util.Scanner;


	public class ZahlenRaten {
		public static void main(String[] args) {

			
			Scanner keyScan = new Scanner(System.in);
			Random rn 	= new Random();
			int zahl 	= rn.nextInt(101);
			int versuche = 0;
			
			System.out.println("Rate eine Zahl zwischen 0 und 100:");
			
			
			while (true) {
			versuche++;
				
			
				
			int antwort = keyScan.nextInt();
			
			
			if (antwort == zahl) { System.out.println("Deine Zahl ist richtig. Anzahl benötigte Versuche: " +versuche);}
						
			else if (antwort > zahl) { System.out.println("Deine Zahl ist zu gross");}
 			
			else {System.out.println("Deine Zahl ist zu klein");}
		
			
			
			
			
			
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}