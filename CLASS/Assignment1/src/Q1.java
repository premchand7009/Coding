package Assignment1;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("The positive integer greater than 2 from command line argument:");
		int a=sc.nextInt();
		int temp=a,c=0;
		while(temp>2) {
			temp=temp/2;
			c++;
		}
		System.out.print("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is :"+c);
	}
}