import java.util.Scanner;
public class PrimeOrNot {
	
	public static boolean primeOrNot(int num){
		boolean result = true;
		
		for(int i=2; i<num; i++) {
			if(num%i==0)
				result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean res = primeOrNot(number);
		if(res==true)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}
}
