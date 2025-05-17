package Assignment1;
public class Q4 {
	public static void main(String[] args) {
		String s="CARBON";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j)
					continue;
				for(int k=0;k<a.length;k++) {
					if(k==i||k==j)
						continue;
					for(int l=0;l<a.length;l++) {
						if(l==i||l==j||l==k)
							continue;
						for(int m=0;m<a.length;m++) {
							if(m==i||m==j||m==k||m==l)
								continue;
							for(int n=0;n<a.length;n++) {
								if(n==i||n==j||n==k||n==l||n==m)
									continue;
								System.out.println(" "+a[i]+a[j]+a[k]+a[l]+a[m]+a[n]);
							}
						}
					}
				}
			}
		}
		

	}
    /*public static void promotion(String str, String newStr) {
		if(str.length()==0) {
			System.out.println(newStr);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String ans=str.substring(0,i)+str.substring(i+1);
			promotion(ans, newStr+str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="CARBON";
		promotion(str, new String());
	}*/
}
