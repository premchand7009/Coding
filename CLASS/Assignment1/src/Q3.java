package Assignment1;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		int N=sc.nextInt();
		int temp=N,sum=0,prod=1;
        while(temp!=0) {
        	int d=temp%10;
        	sum+=d;
        	prod*=d;
        	temp/=10;
        }
        if(sum==prod) {
        	System.out.println("Spy Number");
        }else {
        	System.out.println("Not a Spy Number");
        }
	}

}
