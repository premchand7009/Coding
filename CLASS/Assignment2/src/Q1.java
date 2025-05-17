package Assignment2;
import java.util.Scanner;
class car{
    String model;
    int year;
    void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the model of car:");
        model=sc.next();
        System.out.print("Enter the model year: ");
        year=sc.nextInt();
    }
    void displayData() {
        System.out.println("Model: "+model+", Year: "+year);
    }
}
public class Q1 {

	public static void main(String[] args) {
		car c1=new car();
		car c2=new car();
		c1.model="Toyota";
		c1.year=2020;
		c2.setDetails();
		c1.displayData();
		System.out.print("Another ");
		c2.displayData();
		if(c1.year>c2.year) {
		    System.out.println("Newer car is: "+c1.model);
		}else {
		    System.out.println("Newer car is: "+c2.model);
		}
	}
}
