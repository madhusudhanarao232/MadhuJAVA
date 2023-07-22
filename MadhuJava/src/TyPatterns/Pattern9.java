package TyPatterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
//		n=5
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 1 
//		2 3 4 5 6 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(x<=9) {
					System.out.print(x+" ");
					x++;
				}
				else {
					x=1;
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
		}
	}

}
