package Assignment2;
import java.util.*;
abstract class Shape_{
	abstract void area();
}
class Square extends Shape_{
	double side;
	void area(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sides:");
		double side=sc.nextDouble();
		double area =side*side;
		System.out.println("Area is:"+area);
	}
}
public class Q5 {

	public static void main(String[] args) {
		Square s=new Square();
		s.area();
		System.out.println(s.side);
		

	}

}
