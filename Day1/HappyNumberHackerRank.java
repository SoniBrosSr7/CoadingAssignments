import java.util.Scanner;

public class HappyNumberHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number = sc.next();
		int[] arr = new int[number.length()];
		int index = 0;
		
		int numberInInteger = Integer.parseInt(number);
		while (numberInInteger>0) {
			int digit = numberInInteger%10;
			//System.out.println(digit);
			arr[index]=digit;
			index++;
			numberInInteger = numberInInteger/10;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
