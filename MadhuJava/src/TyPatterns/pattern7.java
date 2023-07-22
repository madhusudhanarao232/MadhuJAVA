package TyPatterns;

import java.util.Scanner;

public class pattern7 {
	//	n = 5
	//  In Two Ways We Print This Pattern	
	//	 * * * * * 
	//	  * * * * 
	//	   * * * 
	//	    * * 
	//	     * 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//-----------------------------------------------------------------------------------		
		//		for(int i=n;i>=0;i--) {
		//			for(int j=n;j>0;j--) {
		//				if (i>=j) {
		//					System.out.print("* "); 	
		//				}
		//				else
		//					System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//		}
		//=================================================================================		 
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");  // single space
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
	}

}
