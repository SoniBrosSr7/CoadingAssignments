import java.util.Scanner;

public class FactorialNormalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int factorial = 1;
		System.out.println("Enter the number you want to find factorial of: ");
		number = sc.nextInt();
		for (int i=1; i<= number; i++) {
			factorial =  factorial * i;
		}
		System.out.println("The factorial is: "+factorial);
	}
}
