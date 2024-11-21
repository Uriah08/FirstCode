package challenges;

import java.util.*;
class palindrome{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = s.nextLine().toLowerCase();
		
//		StringBuilder string = new StringBuilder(word);
//		String result = string.reverse().toString();
//		
//		if(result.equals(word)) {
//			System.out.println("The word " + word + " is Palindrome");
//		}else {
//			System.out.println("The word " + word + " is not Palindrome");
//		}
		if(isPal(word)) {
			System.out.println("The word " + word + " is Palindrome.");
		}else {
			System.out.println("The word " + word + " is not Palindrome.");
		}
	}
	public static boolean isPal(String word) {
		String cleaned = word.replaceAll("[^a-zA-Z0-9]", "");
		
		int words = cleaned.length();
		for(int i = 0;i < words/2;i++) {
			if(cleaned.charAt(i) != cleaned.charAt(words - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
