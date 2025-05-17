package PracticeQuestion;
import java.util.Scanner;
class Person{
	String name;
	int age;
	public void setData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		name=sc.next();
		System.out.print("Enter your age:");
		age=sc.nextInt();
	}
	public void displayData() {
		System.out.println("Name:"+name+" age:"+age);
	}
}
public class Q1 {
	public static void main(String[] args) {
		Person obj1=new Person();
		Person obj2=new Person();
		obj1.name="Prem";
		obj1.age=18;
		obj2.setData();
		obj1.displayData();
		obj2.displayData();
		if(obj1.age>obj2.age) {
			System.out.println(obj2.name+" is younger.");
		}else {
			System.out.println(obj1.name+" is younger.");
		}
	}

 }
