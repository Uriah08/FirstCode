package challenges;
import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String str1 = "playe rs";
		String str2 = "pr as le y";
		boolean result = Anagram(str1, str2);
		if(result) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
	public static boolean Anagram(String str1, String str2) {
		String str11 = str1.replaceAll("[ ]", "").toLowerCase();
		String str22 = str2.replaceAll("[ ]", "").toLowerCase();
		
		char[] char1 = str11.toCharArray();
		char[] char2 = str22.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
	}
}
