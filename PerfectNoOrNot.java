import java.util.Scanner;
public class PerfectNoOrNot {

	public static boolean perfectOrNot(int num) {
		boolean result =  false;
		int sumOfDiv = 0;
		for(int i = 1; i<num;i++) {
			if(num%i==0) {
				sumOfDiv = sumOfDiv+i;
			}
		}
		if(num == sumOfDiv) {
			result = true;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean numberPerfectOrNot = perfectOrNot(number);
		if(numberPerfectOrNot==true)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
		
	}

}
