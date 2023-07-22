package TyPatterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		//	  n=5
		//	    1 
		//	   2 2 
		//	  3 3 3 
		//	 4 4 4 4 
		//	5 5 5 5 5 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(i>=j) {
					System.out.print(i+" ");//single space
				}
				else {
					System.out.print(" ");//single space
				}
			}
			System.out.println();
		}
	}

}
