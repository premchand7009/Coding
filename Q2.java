
//import javax.smartcardio.ATR;
import java.util.Scanner;
public class Q2 {

	public static double[] selectionSort(double[] arr){	
		double[] sorted = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
        	int min=i;
			for (int j = i+1; j <arr.length; j++) {
					if(arr[min]>arr[j]){
						min=j;
					}
				}
			double temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		
		sorted = arr;
		return sorted;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextDouble();	
		}
		System.out.println();
		double[] sorted_arr = selectionSort(arr);
		System.out.print("Sorted Array: ");
		for (int i = 0; i < sorted_arr.length; i++) {
			System.out.print(sorted_arr[i] + " ");
		}
		System.out.println();
	}
}