import java.util.Scanner;

import java.util.ArrayList;

public class Quiz {
 
	public static void main(String[] args) {
		
		ArrayList<QuizItem> items = new ArrayList<QuizItem>();
		

		items.add(new QuizItem("Wie viel gibt 2*6?", "12"));
		items.add(new QuizItem("Wie alt bist du?", "23"));
		items.add(new QuizItem("Wie viele Stunden hat ein Tag?", "24"));
		items.add(new QuizItem("Wie viele Tage hat eine Woche?", "7"));
		
		Scanner keyScan = new Scanner(System.in);
		
		
		for (QuizItem x: items) {
			System.out.println(x.getQuestion());
			System.out.println(items.checkAnswer(answer));		//leider nicht hingekriegt
			
			int eingabe = keyScan.nextInt();
			
			
		}
	}
}