package PracticeQuestion;
import java.util.*;
class NegativeNumberException extends Exception{
	NegativeNumberException(String msg){
		super(msg);
	}
}
public class Q5 {
	public static void check(int a)throws NegativeNumberException{
		if(a<0) {
			throw new NegativeNumberException("Negative number not allowed");
		}else {
			System.out.println("Lucky number is :"+a);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your lucky number:");
		int a=sc.nextInt();
		try {
			check(a);
		}
		catch(NegativeNumberException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("try again ");
			sc.close();
		}
	}
}