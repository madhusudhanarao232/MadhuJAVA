package TyPatterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
//		n = 5
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
	}

}
