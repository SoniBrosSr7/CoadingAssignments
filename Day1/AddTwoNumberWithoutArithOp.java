import java.util.Scanner;
public class AddTwoNumberWithoutArithOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = sc.nextInt();
		System.out.println("Enter the second number: ");
		int second = sc.nextInt();
		
		int temp = first;
		if(second>0) {
			while(second>0) {
				temp++;
				second--;	
			}
		}
		else {
			while(second<0) {
				temp--;
				second++;
			}
		}
		System.out.println("The sum is: "+temp);
	}

}
