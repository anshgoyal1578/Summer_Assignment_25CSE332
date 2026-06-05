//program to find whether the given number is prime or not


import java.util.*;
public class prime
{
    public static void main(String[] args)
    {
        int i, n,count=0;
        Scanner ob=new Scanner(System.in);


        System.out.println("Enter the number");


        n=ob.nextInt();// The number input by the user is stored in n
        



        //procedure to check whether the given number is prime or not
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("The given number is prime");
        
        }
        else
        {
            System.out.println("The given number is not prime");
        }
        ob.close();
    }
}