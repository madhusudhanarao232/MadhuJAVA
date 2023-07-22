package TyPatterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// n = 5
		//        * 
		//      * * 
		//    * * * 
		//  * * * * 
		//* * * * * 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
	}

}
