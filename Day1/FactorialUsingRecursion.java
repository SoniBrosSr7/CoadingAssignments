import java.util.Scanner;

public class FactorialUsingRecursion {

	public static int factorial(int num) {
		if (num==0) {
			return 1;	
		}
		else {
			return num * factorial(num-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int res = 1;
		System.out.println("Enter the number you want to find factorial of: ");
		number = sc.nextInt();
		res = factorial(number);
		
		System.out.println("The factorial of the number is: "+res);
	}
}
