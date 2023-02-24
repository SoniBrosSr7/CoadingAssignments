import java.util.Scanner;
public class ReverseANumberWhileLoop {

	public static int Reverse(int num) {
		int result = 0;
		while(num>0) {
			int remainder = num % 10;
			result = (result*10)+remainder;
			num = num/10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int result = Reverse(number);
		System.out.println("The reversed number is: "+result);
	}

}
