package PracticeQuestion;

public class Q7 {
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int r=n%10;
		return r+sum(n/10);
		
	}

	public static void main(String[] args) {

		System.out.println(sum(99999));
	}

}
