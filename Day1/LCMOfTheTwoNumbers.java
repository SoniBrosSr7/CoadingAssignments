import java.util.Scanner;
public class LCMOfTheTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter the seccond number: ");
		int secNum = sc.nextInt();
		int gcd = 1;

		if(firstNum==secNum) {
			gcd = firstNum;
		}
		else if(firstNum>secNum) {
			gcd = firstNum-secNum;
			while(gcd>0) {
				if(firstNum%gcd==0) {
					break;
				}
				gcd--;
			}
		}
		else {
			gcd = secNum-firstNum;
			while(gcd>0) {
				if(secNum%gcd==0) {
					break;
				}
				gcd--;
			}
		}
		
		int multiplicationOfNum = firstNum*secNum;
		int lcm = multiplicationOfNum/gcd;
		
		System.out.println("The LCM is: "+lcm);
	}
}
