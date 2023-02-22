import java.util.Scanner;

public class SmallestNumberOutOFThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		System.out.println("Enter third number: ");
		int third = sc.nextInt();
		
		if(first<second) {
			if (first<third) {
				System.out.println(first);
			}
			else {
				System.out.println(third);
			}
		}
		else {
			if(second<third) {
				System.out.println(second);
			}
			else {
				System.out.println(third);
			}
		}
	}

}
