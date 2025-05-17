package PracticeQuestion;
import java .util .Scanner;
class Student{
	String name ;
	int age;
	double marks;
	public void setData () {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.next();
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Marks:");
		marks=sc.nextDouble();	
		}
	public void displayData() {
		System.out.println("Name:"+name+",Age:"+age+",Marks:"+marks);  
	}
}

public class Q3 {
	public static void main(String[] args) {
		Student a[]=new Student[5];
		for(int i=0;i<5;i++) {
			a[i]=new Student();
			a[i].setData();
		}
		for (int i=0;i<5;i++) {
			a[i].displayData();
		}

	}

}
