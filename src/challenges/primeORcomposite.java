package challenges;
import java.util.Scanner;

public class primeORcomposite {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Enter a number: ");
		int number = s.nextInt();
		if(number <= 1) {
			isPrime = false;
		}else {
			for(int i = 2;i * i <= number;i++) {
				if(number%i==0) {
					System.out.println(i);
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println("The number " + number + " is Prime");
		}else {
			System.out.println("The number " + number + " is Composite");
		}
	}
}
