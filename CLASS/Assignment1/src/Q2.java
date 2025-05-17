package Assignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter person Weight in kg:");
		int w=sc.nextInt();
        System.out.print("Enter height of person in meter:");
        double h=sc.nextDouble();
        double bmi=w/Math.pow(h, 2);
        String ab=" ";
        if(bmi<18.5) {
        	ab="Underweight";
        }else if(18.5<=bmi&&bmi<=24.9) {
        	ab="Normal Weight";
        }else if(25.0<=bmi&&bmi<=29.9) {
        	ab="Overweight";
        }else if(30.0<=bmi) {
        	ab="Obese";
        }
        System.out.println("The person is "+ab);
	}

}
