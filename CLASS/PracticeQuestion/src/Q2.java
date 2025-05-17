package PracticeQuestion;
import java.util.*;

class Complex {  
    double real;
    double img;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real value: ");
        real = sc.nextDouble();
        System.out.print("Enter an imaginary value: ");
        img = sc.nextDouble();
    }

    public void display() {
        System.out.println("Complex number: " + real + " + " + img + "i");
    }

    /*public Complex add(Complex obj1, Complex obj2) { 
        Complex obj3 = new Complex();
        obj3.real = obj1.real + obj2.real;
        obj3.img = obj1.img + obj2.img;
        return obj3; 
    }*/

    public Complex add(Complex obj2) {
    	Complex obj3 = new Complex();
        obj3.real = real + obj2.real;
        obj3.img = img + obj2.img;
        return obj3; 
    }

}
public class Q2 {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        obj1.setData(); 
        obj1.display(); 

        Complex obj2 = new Complex();
        obj2.setData();  
        obj2.display();  

        Complex obj3 = new Complex();
        obj3=obj1.add(obj2);

        System.out.print("Sum of complex numbers: ");
        obj3.display(); 
    }
}
