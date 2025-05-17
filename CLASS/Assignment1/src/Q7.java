package Assignment1;
import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of elements of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0],min=a[0];
        for(int j=1;j<n;j++) {
        	if(max<a[j]) {
        		max=a[j];
        	}
        	if(min>a[j]) {
        		min=a[j];
        	}
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++) {
        	if(max==a[i]) {
        		c1++;
        	}
        	if(min==a[i]) {
        		c2++;
        	}
        }
        System.out.println("Maximum element of array is "+max+" and occures "+c1+" times.");
        System.out.println("Minimum element of array is "+min+" and occures "+c2+" times.");
        int c3=0,c4=0;
        for(int i=0;i<n;i++) {
        	if(max==a[i]) {
        		c3=i+1;
        		break;
        	}
        }
        for(int i=n-1;i>=0;i--) {
        	if(min==a[i]) {
        		c4=i+1;
        		break;
        	}
        }
        System.out.println("First occurence of maximum element is at position "+c3);
        System.out.println("Last occurence of minimum element is at position "+c4);
	}

}