import java.util.Scanner;

public class EvenOrOddByBitwiseXORMethod {
	
	public static void main (String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		if ((number^1)>number) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
	}
}
