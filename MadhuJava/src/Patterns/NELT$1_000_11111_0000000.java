package Patterns;

import java.util.Scanner;

public class NELT$1_000_11111_0000000 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int sp=1;sp<=n-i;sp++)
			{
				System.out.print("  ");// 2 space
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print(i%2+" ");//  1 Space
				
			}
			System.out.println();
		}
	}

}