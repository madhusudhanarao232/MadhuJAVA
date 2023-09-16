package TyPatterns;

public class A4b3cd2 {
	public static void main(String[] args) {
		String s="a4b3cd2";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int num = 0;
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {

				if(s.charAt(i+1)>='1'&&s.charAt(i+1)<='9') {
					num=(s.charAt(i+1))-48;	
				}
				else {
					num=1;
				}
			}
			for(int j=1;j<=num;j++) {
				System.out.print(ch);
			}

		}
	}

}
