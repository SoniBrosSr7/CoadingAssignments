import java.util.Scanner;

public class PrimeFactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		PrimeFact(number);
	}

	private static void PrimeFact(int number) {
		// TODO Auto-generated method stub
		int i = 2;
		if(number>0) {
			while(number > 1) {
				if(number%i==0) {
					System.out.print(i+" ");
					number = number/i;
				}
				else {
					i++;
				}
			}
		}
	}

}
