
public class QuizItem {

	private String question;
	private String answer;
	
		
	
	public QuizItem(String question, String answer) {		//Konstruktor
		this.question = question;
		this.answer = answer;
	
		
	}
		
		
	
	public String getQuestion() {							//Getter Methode Question
		return question;
	}

	
	public boolean checkAnswer(String answer) {
	
		
		
		
		if (this.answer.equals(answer)){
		
			return true;
		}
		
		else
		
		{
			return false;
		}
			
	}
	
	
	
	
	
	
	
}