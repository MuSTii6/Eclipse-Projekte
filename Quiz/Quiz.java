import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
	
		String [] frage = new String[4]; 
		frage[0] = "Frage 1: Wie viel gibt 2*6? \n"; 
		frage[1] = "Frage 2: Wie viele Stunden hat ein Tag? \n"; 
		frage[2] = "Frage 3: Wie hoch ist der Eiffelturm? \n"; 
		frage[3] = "Frage 4: Wie alt bist du? \n";
		int []  antwort = {12,24,324,23};	
		int richtige = 0;
	
		Scanner keyScan = new Scanner(System.in);

		
		
		{
			
		
		
				for (int count = 0; count < frage.length;count++) 		{
						System.out.print(frage[count]); 
		
					
						
						int eingabe = keyScan.nextInt();

						if (eingabe == antwort[count]) {
							System.out.println("Richtig");
						
						richtige++;
						
						} 
						
				
						
						else {
							System.out.println("Falsch");
						}	
			
						
						
			
				}
				
				 
				
				{ 	if (richtige < 2) {
					System.out.print("Anzahl richtige Antworten: "+richtige+" von 4. Du hast noch Potenzial!");}
				
				
					else if (richtige > 1 & richtige < 4) {
						System.out.print("Anzahl richtige Antworten: "+richtige+" von 4. Nicht schlecht!");}
				
					else {System.out.print("Anzahl richtige Antworten: "+richtige+" von 4. Super, gratuliere!");}
				
				}
					
					
					
				
		
				
				
		}
		
		

		
		
		
		
		}
		
	}

