package PracticeQuestion;

public class Q6 {
	public <T> void printArray(T[]array) {
		for(T i:array) {
			System.out.print(i+" ");
		}
	}
	public <T> int count(T[]array,T a) {
		int c=0;
		for(T i:array) {
			if(i==a){
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Q6 t=new Q6();
		Integer a[]= {1,1,3,5,9,1};
		Character b[]= {'a','v','b','a'};
		String c[]= {"Prem","Chand","Patra"};
		t.printArray(a);
		System.out.println();
		t.printArray(b);
		System.out.println();
		t.printArray(c);
		System.out.println();
		System.out.println(t.count(a,1));
		System.out.println(t.count(b,'a'));
		System.out.println(t.count(c,"Prem"));
	}

}
