import java.util.Scanner;

public class PrintFactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
