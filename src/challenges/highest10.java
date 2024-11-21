package challenges;
import java.util.Scanner;

public class highest10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = numVal();
		System.out.println("The highes number is: " + num);
	}
	public static int numVal() {
		Scanner s = new Scanner(System.in);
		int temp = 0;
		int num = 0;
		for(int i = 0;i < 10;i++) {
			System.out.print("Enter a number " + (i+1) + ": ");
			if(s.hasNextInt()) {
				num = s.nextInt();
				if(num < 0) {
					System.out.println("Please enter positive number");
					i--;
				}else if(num > temp){
					temp = num;
				}
			}else {
				s.next();
				System.out.println("Invalid Input");
				i--;
			}
		}
		return temp;
	}
}
