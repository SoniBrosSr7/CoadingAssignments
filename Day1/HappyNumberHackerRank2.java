//It is not completed now
import java.awt.image.RescaleOp;
import java.util.Scanner;

public class HappyNumberHackerRank2 {

	public static int sumSqDigit(int num) {
		int sum=0;
		while (num!=0) {
			int digit = num%10;
			sum = sum + ((digit)*(digit));
			num = num/10;
		}	
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number = sc.next();
		int numberInInteger = Integer.parseInt(number);
		System.out.println("The number is: "+numberInInteger);
		
		int result = sumSqDigit(numberInInteger);
		
		System.out.println("The value of sum is: "+result);
		if(result==1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not a happy number");
		}
	}

}
