import java.util.Scanner;
public class PallindromeOrNot {

	public static int Reverse(int num) {
		int result = 0;
		int temp = num;
		while(temp>0) {
			result = (result*10)+(temp%10);
			temp = temp/10;
		}
		return result; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int reverse = Reverse(number);
		if(number==reverse) {
			System.out.println("The number is pallindrome");
		}
		else {
			System.out.println("The numbers are not pallindrome");
		}
	}

}
