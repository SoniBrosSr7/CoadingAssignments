/*
 * The Bitwise OR of Even number is increases the number for Odd number retains the number as it is
 */
import java.util.Scanner;

public class EvenOrOddByBitwiseOrMethod {
	
	public static void main (String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		if ((number|1)>number) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
	}
}
