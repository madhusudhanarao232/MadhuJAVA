package Patterns;

import java.util.Scanner;

public class SLRT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print(" *");	
			}
			System.out.println();
		}
	}
}
