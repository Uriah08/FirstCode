package dictionary;

import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		System.out.print("Enter a phrase: ");
		String phrase = s.nextLine().toLowerCase();
		
		String[] clean = phrase.split("\\s+");
		for(String word : clean) {
			map.put(word, map.getOrDefault(word, 0)+ 1);
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
