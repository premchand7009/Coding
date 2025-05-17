package Assignment2;
import java.util.Scanner;
class Student {
	int roll;
	String name;
	double DSA_mark;
	void getData(){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Student's name:");
		name=sc.nextLine();
		System.out.print("Enter "+name+"'s roll number:");
		roll=sc.nextInt();
		System.out.print("Enter "+name+"'s DSA Mark:");
		DSA_mark=sc.nextDouble();
	}
	void showData() {
		System.out.println("Student's Name: "+name+" ,Roll number: "+roll+" ,DSA Mark: "+DSA_mark);
	}
}
public class HQ1 {
	public static void main(String[] args) {
		Student s[]=new Student[5];
		for(int i=0;i<s.length;i++) {
			s[i]=new Student();
			s[i].getData();
		}
		int a=0;
		for(int i=0;i<s.length;i++) {
			s[i].showData();
			if(s[i].DSA_mark>=s[a].DSA_mark) {
				a=i;
			}
		}
		System.out.println("Student's detail who has secured highest mark:\nName: "+s[a].name+" ,Roll number: "+s[a].roll+" ,DSA Mark: "+s[a].DSA_mark);
		
	}

}
