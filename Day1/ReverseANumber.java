import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum=0;
		String numInString = Integer.toString(number);
		int place = ((numInString.length()/10)*100);
		while(number>0) {
			int temp = 0;
			temp = number%10;
			sum = sum + temp*place;
			place = place/10;
		}
		System.out.println("The sum is "+sum);
	}

}
