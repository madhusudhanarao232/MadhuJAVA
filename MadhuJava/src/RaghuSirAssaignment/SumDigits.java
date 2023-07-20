package RaghuSirAssaignment;
import java.util.Scanner;
public class SumDigits {
public static int sumDigits(int x)
{
    int sum=0,ld=0;
       do{
             ld=x/10;
             sum=sum+(ld*ld);
             x=x/10;
             }
          while(x>0);
     return sum;
      
}
public static void main(String[]args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sd=sumDigits(n);
 System.out.print(sd);
}
}