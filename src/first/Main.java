package first;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = s.nextLong();
		
		String result = NumValidation(num);
		System.out.println(result);
	}
	public static String NumValidation(long number) {
		String units[] = {"","Thousand","Million","Billion","Trillion","Quadrillion","Septillion"};
		int index = 0;
		String result = "";
		if(number < 0) {
			number = Math.abs(number);
			while(number > 0) {
				if(number % 1000 != 0) {
					result = NumToWord((int) number % 1000) + " " + units[index] + " " + result;
				}
				index++;
				number /= 1000;
			}
			return "Negative " + result;

		}else if(number == 0) {
			return "Zero";
		}else {
			while(number > 0) {
				if(number % 1000 != 0) {
					result = NumToWord((int) number % 1000) + " " + units[index] + " " + result;
				}
				index++;
				number /= 1000;
			}
			return result;
		}
	}
	public static String NumToWord(int number) {
		String ones[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String teens[] = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		if(number < 10) {
			return ones[number];
		}else if(number < 20) {
			return teens[number % 10];
		}else if(number < 100) {
			return tens[number / 10] + " " + ones[number % 10];
		}else{
			return ones[number / 100] + " Hundred " + NumToWord(number % 100);
		}
	}
}
