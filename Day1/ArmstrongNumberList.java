import java.util.Scanner;
public class ArmstrongNumberList {

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
		
		for(int i=1; i<=1000;i++) {
			int length = LengthOfNum(i);
			//System.out.println("Length is: "+length);
			
			int armStrong =  ArmstrongNumber(i, length);
			//System.out.println("The Armstrong value is: "+armStrong);
			
			if(i==armStrong)
				System.out.print(i+" ");
		}
		
	}

}
