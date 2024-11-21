package challenges;
import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {
	public static void main(String[] args) {
		boolean pass = false;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Rock Paper Scissor");
		System.out.print("Your choice: ");
		String choice = s.nextLine().toLowerCase();
		
		String choices[] = {"rock","paper","scissor"};
		int computer = r.nextInt(3);
		for(String pick : choices) {
			if(pick.equals(choice)) {
				pass = true;
				break;
			}
		}
		if(pass) {
			System.out.println("Computer choice: " + choices[computer]);
		if(choice.equals(choices[computer])) {
			System.out.println("Tie");
		}else if(choice.equals("scissor") && choices[computer].equals("paper") ||
				 choice.equals("paper") && choices[computer].equals("rock") ||
				 choice.equals("rock") && choices[computer].equals("scissor")) {
			System.out.println("Player wins");
		}else {
			System.out.println("Computer wins");
		}
		}else {
			System.out.println("Invalid Input");
		}
	}
}
