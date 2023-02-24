import java.util.Scanner;
public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}
		
		for(char s: arr) {
			System.out.print(s+" ");
		}
	}

}
