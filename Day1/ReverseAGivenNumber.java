import java.util.Scanner;
public class ReverseAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		String numberString = Integer.toString(number);
		int index = numberString.length();
		char[] arrayOfChar = numberString.toCharArray();
		char[] arr = new char[numberString.length()];
		for(char i : arrayOfChar) {
			arr[index-1]= i;
			index--;
		}
		
		System.out.println("The number after reversal");
		for(char i: arr) {
			System.out.print(i);
		}
	}

}
