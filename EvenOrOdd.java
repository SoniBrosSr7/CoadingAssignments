import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		if ((number % 2)==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}
}
