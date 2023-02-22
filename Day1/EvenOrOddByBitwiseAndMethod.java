/*
 * The Bitwise AND of Even number is 0 for Odd number it is 1
 */
import java.util.Scanner;

public class EvenOrOddByBitwiseAndMethod {
	
	public static void main (String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		if ((number&1)==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
	}
}
