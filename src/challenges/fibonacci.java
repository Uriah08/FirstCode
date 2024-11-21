 package challenges;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int first = 0;
		int second = 1;
		for(int i = 0;i < num;i++) {
			System.out.println(first + " ");
			int add = first + second;
			first = second;
			second = add;
		}
	}
}
