//Q1	Write a program to Calculate sum of first N natural numbers.
import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        int N,i,sum=0;
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter the value of N");
        N=ob.nextInt();
        for(i=1;i<=N;i++)
        {
            sum+=i;
        }
        System.out.println("sum of N natural numbers are:"+sum);
        
    }
}