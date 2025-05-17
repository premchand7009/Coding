package Assignment1;
import java.util.Scanner;
public class Q9 {
	public static double sumMajorDiagonal(double [][]m) {
		double sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double m[][]=new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		System.out.print("Sum of the elements in the major diagonal is:"+sumMajorDiagonal(m));
	}

}
