/*
 * Here I am making use of Arithmetic operator which are opposite to each other
 */
import java.util.Scanner;
public class SwapTwoNumberWithoutThirdVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = sc.nextInt();
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("The numbers after swapping is "+firstNumber+" and "+secondNumber);
	}

}
