import java.util.Scanner;

public class GCDOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter second number: ");
		int gcd = 1;
		
		int secondNum = sc.nextInt();
		if (firstNum==secondNum) {
			gcd = firstNum;
			System.out.println(gcd);
		}
		else if(firstNum>secondNum) {
			gcd = firstNum-secondNum;
			while(gcd>0) {
				if(firstNum%gcd==0) {
					System.out.println(gcd);
					break;
				}
				gcd--;
			}
		}
		else {
			gcd = secondNum-firstNum;
			while(gcd>0) {
				if(secondNum%gcd==0) {
					System.out.println(gcd);
					break;
				}
				gcd--;
			}
		}
	}
}