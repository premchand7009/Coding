package Assignment1;
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows and columns of 2D-Array:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		System.out.print("Enter elements of 2-D Array row by row :");
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of elements of the 2D-Array is:"+sum);
	}

}
