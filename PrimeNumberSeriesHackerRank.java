import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumberSeriesHackerRank {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number = 1000;        //I need to print series till 1000
        int[] arr = new int[number];
        int index = 0;
        int temp;
        for(int i=1; i<=number; i++) {
            temp = 0;
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    temp++;
                }
            }
            if(temp==2) {
                arr[index] = i;
                index++;
            }
            else {
                temp = 0;
            }
        }
        /*
        for (int i : arr) {
            if(i!=0) {
                System.out.println(i);    
            }
        }
        */
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the index: ");
        int checkIndex = sc.nextInt();
        if (checkIndex>0) {
            System.out.println(arr[checkIndex-2]+" "+arr[checkIndex-1]+" "+arr[checkIndex]);
        }
        else {
            System.out.println("\"INVALID INPUT\"");
        }
    }
}