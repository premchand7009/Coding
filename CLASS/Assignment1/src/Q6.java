package Assignment1;
import java.util.Scanner;
public class Q6 {
	public static boolean isOdd(int n) {
		while(n>0) {
			n=n-2;
		}
		if(n==0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		int n=sc.nextInt();
        System.out.println(n+"is odd?"+isOdd(n));
	}

}
