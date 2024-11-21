package challenges;
import java.util.Scanner;

public class highest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int numbers[] = new int[3];
		for(int i = 0;i < 3;i++) {
			System.out.print("Enter the " + (i+1) + ". number: ");
			numbers[i] = s.nextInt();
		}
		int result = getHighest(numbers);
		System.out.println(result);
	}
	public static int getHighest(int[] numbers) {
		if(numbers[0] > numbers[1] && numbers[0] > numbers[2]) {
			return numbers[0];
		}else if(numbers[1] > numbers[2]) {
			return numbers[1];
		}else {
			return numbers[2];
		}
	}
}
