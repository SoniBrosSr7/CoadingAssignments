import java.util.Scanner;

public class PrintSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number= sc.next();
		int numberInt = Integer.parseInt(number);		//Converting it into Integer
		
		int[] arr = new int[number.length()];	//The size of array is equal to length
		int index = (number.length()-1);		//It would store value from the end index
		while(numberInt>0) {
			int digit = numberInt%10;
			arr[index]= digit;
			numberInt = (numberInt/10);
			index--;
		}
		
		int sum = 0;
		for(int i: arr){						//foreach loop to traverse through the element
			sum = sum+i;
		}
		System.out.println("The sum is: "+sum);
	}

}
