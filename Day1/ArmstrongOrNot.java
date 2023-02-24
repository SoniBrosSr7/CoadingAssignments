import java.util.Scanner;
public class ArmstrongOrNot {

	public static int LengthOfNum(int num) {
		int length = 1;
		if(num>0) {
			while((num/10)>0) {
				length++;
				num=num/10;
			}
		}
		return length;
	}
	
	public static int ArmstrongNumber(int number, int length) {
		int armstrongValue = 0;
		while(number>0) {
			int remainder = number%10;
			armstrongValue = (int) (armstrongValue+ Math.pow(remainder, length));
			number = number/10;
		}
		return armstrongValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int length = LengthOfNum(number);
		System.out.println("Length is: "+length);
		
		int armStrong =  ArmstrongNumber(number, length);
		System.out.println("The Armstrong value is: "+armStrong);
		
		if(number==armStrong)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
