package Assignment2;
import java.util.Scanner;
class Complex{
    double real;
    double img;
    Scanner sc=new Scanner(System.in);
    void setData() {
        System.out.print("Enter a real number:");
        real=sc.nextDouble();
        System.out.print("Enter a imaginary numbers:");
        img=sc.nextDouble();
    }
    void displayData() {
        System.out.println("Complex is: "+real+"+"+img+"i");
    }
    public Complex add(Complex c1,Complex c2) {
	    Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.img=c1.img+c2.img;
        return c3;
    }
}
public class Q2 {

	public static void main(String[] args) {
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		c1.setData();
		c2.setData();
		c3=c3.add(c1,c2);
		c1.displayData();
		c2.displayData();
		System.out.print("Addition of two ");
		c3.displayData();

	}

}
