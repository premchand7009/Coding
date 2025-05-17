public class Q1 {
	public static void repeated(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
				}
				if(count==2) {
					break;
				}
			}
			if(count==1) {
				System.out.println(ch);
				break;
			}else {
				count=0;
			}
		}
	}

	public static void main(String[] args) {
		String str="prtpprr";
		repeated(str);
	}

}


