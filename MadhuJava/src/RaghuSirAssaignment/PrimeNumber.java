package RaghuSirAssaignment;
import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrimeNumber(int x) 
    {
		for (int i=2;i<=x/2;i++)
		{
			if (x%i==0)
				return false;
		}
				return  true;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number ");
		int n=sc.nextInt();
		boolean rs=isPrimeNumber(n);
		if(rs==true)
			System.out.println(rs+" is a prime number");
		else
			System.out.println(rs+" is not a primr number");
		
	}
}
