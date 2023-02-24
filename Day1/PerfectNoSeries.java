import java.util.Scanner;
public class PerfectNoSeries {

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
		System.out.print("Enter the number till you want to print series: ");
		int number = sc.nextInt();
		
		for(int i = 1; i<=number ; i++) {
			boolean numberPerfectOrNot = perfectOrNot(i);
			if(numberPerfectOrNot==true)
				System.out.print(i+" ");	
		}
		
	}

}
