
import java.util.*;

class ReverseString{
	
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		str=sc.nextLine();
		sc.close();
		String rev=reverseString(str);
		System.out.println("The reverse string is: "+rev);
	}
	public static String reverseString(String str)
	{
		if(str.isEmpty())
			return str;
		return reverseString(str.substring(1))+str.charAt(0);
	}
}