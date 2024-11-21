package challenges;
import java.util.*;
public class Quiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int corrects = 0;
		String[] answer = {"A","D","D","A","C"};
		List<String> answers = new ArrayList<>();
		answers.addAll(Arrays.asList(answer));
        List<String> guesses = new ArrayList<>();
		String [] questions = {"Question 1? ","Question 2? ","Question 3? ","Question 4? ","Question 5?"};
		String [][] choices = {
				{"A1","B1","C1","D1"},
				{"A2","B2","C2","D2"},
				{"A3","B3","C3","D3"},
				{"A4","B4","C4","D4"},
				{"A5","B5","C5","D5"}};
		int index = 0;
		for(int i = 0;i < choices.length; i++) {
			System.out.println(questions[index]);
			for(int j = 0;j < choices.length-1;j++) {
				System.out.println(choices[i][j]);
			}
			System.out.print("Enter choice: ");
			String guess = s.nextLine().toUpperCase();
			guesses.add(guess);
			index++;
			corrects += check(answers.get(i), guess);
		}
		display(answers, guesses);
		System.out.println("Your correct answers " + corrects);

	}
	public static void display(List<String> answers, List<String> guesses) {
		System.out.println("Your answers: " + answers);
		System.out.println("correct answers: " + guesses);
	}
	private static int check(String answer, String guess) {
		int correct = 0;
		boolean isCorrect = false;
		if(answer.equals(guess)) {
			isCorrect = true;
		}
		if(isCorrect) {
			correct += 1;
		}
		return correct;
	}
}
