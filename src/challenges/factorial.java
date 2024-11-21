package challenges;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = s.nextInt();
		
		int result = 1;
		if(number <= 0) {
			System.out.println("Invalid Input");
		}else {
			for(int i = 1;i <= number;i++) {
				result *= i;
			}
			System.out.println(result);
		}
	}
}
