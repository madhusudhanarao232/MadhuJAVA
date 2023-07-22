package TyPatterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		//   n=5
		//	In Two Ways We Print This Pattern     
		//	    * 
		//	   * * 
		//	  * * * 
		//	 * * * * 
		//	* * * * * 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//-----------------------------------------------------------------------------------		
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=n;j++) {
				if (i<j) {
					System.out.print("* "); 	
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		//=================================================================================		 
		//		for(int i=1;i<=n;i++) {
		//			for(int k=i;k<=n;k++) {
		//				System.out.print(" ");  // single space
		//			}
		//			for(int j=1;j<=i;j++) {
		//				System.out.print("* "); 
		//			}
		//			System.out.println();
		//		}
	}
}

