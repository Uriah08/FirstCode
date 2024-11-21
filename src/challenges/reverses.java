package challenges;
import java.util.Scanner;

public class reverses {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String phrase = s.nextLine();
		
		System.out.println(reverses(phrase));
	}
	public static String reverses(String phrase) {
		char charArray[] = phrase.toCharArray();
		int start = 0;
		int end = charArray.length-1;
		while(start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			
			start++;
			end--;
		}
		return new String(charArray);
	}
}
