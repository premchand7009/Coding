package Assignment1;
import java.util.Scanner;
public class Q5 {
	public static int sum_of_Digits(int n) {
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int d=temp%10;
			sum+=d;
			temp/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		int n=sc.nextInt();
		int temp=n;
		while(temp>9) {
			temp=sum_of_Digits(temp);
		}
		System.out.println(temp);

	}

}
