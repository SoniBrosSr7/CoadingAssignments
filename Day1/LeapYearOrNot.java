import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to determine if it is leap or not?");
		int number = sc.nextInt();
		
		if(number%4==0) {
			if(number%100==0) {
				if(number%400==0) {
					System.out.println("Leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("Not a leap year!");
		}
	}

}
