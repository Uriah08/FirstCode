package challenges;
import java.util.Scanner;
public class deleteV {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String phrase = s.nextLine();
		
		String result = deleteV(phrase);
		System.out.println(result);
	}
	public static String deleteV(String phrase) {
		return phrase.replaceAll("[aeiouAEIOU]", "");
	}
}
