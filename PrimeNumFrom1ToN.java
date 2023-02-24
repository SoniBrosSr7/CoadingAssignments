import java.util.Scanner;

public class PrimeNumFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number till I want to print prime no series: ");
		int number = sc.nextInt();
		PrimeNoSeries(number);
	}
	
	public static void PrimeNoSeries(int number){
		for(int i=2; i<= number;i++) {
			int flag = 0;			//It means it is a prime number
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag = 1;		//1 means it is not a prime number
					break;
				}
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
		}
	}

}
