package Assignment1;
public class HQ5 {
	public static void main(String[] args) {
		int a[][]=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*2);
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int s1;int r1=0;int h1=0;
		for(int i=0;i<4;i++) {
			s1=0;
			for(int j=0;j<4;j++) {
				s1+=a[i][j];
			}
			if(r1<s1) {
				r1=s1;
				h1=i;
			}
		}
		System.out.println("The largest row index:"+h1);
		int s2;int r2=0;int h2=0;
		for(int i=0;i<4;i++) {
			s2=0;
			for(int j=0;j<4;j++) {
				s2+=a[j][i];
			}
			if(r2<s2) {
				r2=s2;
				h2=i;
			}
		}
		System.out.println("The largest column index:"+h2);
	}
}